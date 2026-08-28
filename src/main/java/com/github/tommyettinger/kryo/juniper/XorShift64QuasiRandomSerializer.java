/*
 * Copyright (c) 2022-2024 See AUTHORS file.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.github.tommyettinger.kryo.juniper;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.github.tommyettinger.random.XorShift64QuasiRandom;

/**
 * Kryo {@link Serializer} for juniper {@link XorShift64QuasiRandom}s.
 */
public class XorShift64QuasiRandomSerializer extends Serializer<XorShift64QuasiRandom> {

    public XorShift64QuasiRandomSerializer() {
        setImmutable(false);
        setAcceptsNull(false);
    }

    @Override
    public void write(final Kryo kryo, final Output output, final XorShift64QuasiRandom data) {
        output.writeVarLong(data.getState(), false);
    }

    @Override
    public XorShift64QuasiRandom read(final Kryo kryo, final Input input, final Class<? extends XorShift64QuasiRandom> dataClass) {
        return new XorShift64QuasiRandom(input.readVarLong(false));
    }

    @Override
    public XorShift64QuasiRandom copy(Kryo kryo, XorShift64QuasiRandom original) {
        return original.copy();
    }
}