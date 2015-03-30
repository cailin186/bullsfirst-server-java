/**
 * Copyright 2011 Archfirst
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
package org.archfirst.bfexch.infra.fixtrading.converters;

import org.archfirst.common.quantity.DecimalQuantity;

import quickfix.FieldNotFound;
import quickfix.field.CumQty;

/**
 * CumQtyConverter
 *
 * @author Naresh Bhatia
 */
public class CumQtyConverter {

    public static CumQty toFix(DecimalQuantity quantity) {
        return new CumQty(quantity.doubleValue());
    }

    public static DecimalQuantity toDomain(CumQty cumQty)
            throws FieldNotFound {
        return new DecimalQuantity(cumQty.getValue());
    }
}