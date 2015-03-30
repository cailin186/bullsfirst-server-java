/**
 * Copyright 2010 Archfirst
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.archfirst.common.springtest.spec;

import org.archfirst.common.springtest.AbstractSpecTest;
import org.springframework.test.context.ContextConfiguration;

/**
 * SimpleTest
 *
 * @author Naresh Bhatia
 */
@ContextConfiguration(locations={"classpath:/org/archfirst/common/springtest/test/applicationContext.xml"})
public class SimpleTest extends AbstractSpecTest {

    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}