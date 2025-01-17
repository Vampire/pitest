/*
 * Copyright 2011 Henry Coles
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the License.
 */
package org.pitest.mutationtest.statistics;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MutationStatisticsTest {

  @Test
  public void shouldNotHaveHundredPercentIfNotAllKilled() {
    assertEquals(99, new MutationStatistics(null, 2000, 1999, 1).getPercentageDetected());
  }

  @Test
  public void shouldHaveHundredPercentIfAllKilled() {
    assertEquals(100, new MutationStatistics(null, 2000, 2000, 1).getPercentageDetected());
  }

  @Test
  public void shouldHaveHundredPercentIfNoMutations() {
    assertEquals(100, new MutationStatistics(null, 0, 0, 0).getPercentageDetected());
  }

}
