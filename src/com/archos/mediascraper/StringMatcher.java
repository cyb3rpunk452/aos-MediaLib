// Copyright 2017 Archos SA
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.archos.mediascraper;

import java.util.HashMap;

public class StringMatcher {
    public static final int NO_MATCH = -1;

    private final HashMap<String, Integer> mMap = new HashMap<String, Integer>();

    public void addKey(String key, final int value) {
        Integer integer = Integer.valueOf(value);
        if ((integer = mMap.put(key, integer)) != null) {
            throw new IllegalArgumentException("already mapped [" + key + "] -> " + integer);
        }
    }

    public int match(String input) {
        return match(input, NO_MATCH);
    }

    public int match(String input, int defaultValue) {
        Integer integer = mMap.get(input);
        return integer != null ? integer.intValue() : defaultValue;
    }
}
