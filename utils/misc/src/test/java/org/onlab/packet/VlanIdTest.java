/*
 * Copyright 2014 Open Networking Laboratory
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
package org.onlab.packet;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.google.common.testing.EqualsTester;

public class VlanIdTest {

    @Test
    public void testEquality() {

        VlanId vlan1 = VlanId.vlanId((short) -1);
        VlanId vlan2 = VlanId.vlanId((short) 100);
        VlanId vlan3 = VlanId.vlanId((short) 100);

        new EqualsTester().addEqualityGroup(VlanId.vlanId(), vlan1)
        .addEqualityGroup(vlan2, vlan3)
        .addEqualityGroup(VlanId.vlanId((short) 10));

    }

    @Test
    public void basics() {
        // purposefully create UNTAGGED VLAN
        VlanId vlan1 = VlanId.vlanId((short) 10);
        VlanId vlan2 = VlanId.vlanId((short) -1);

        assertEquals("incorrect VLAN value", 10, vlan1.toShort());
        assertEquals("invalid untagged value", VlanId.UNTAGGED, vlan2.toShort());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testIllicitVLAN() {
        VlanId.vlanId((short) 5000);
    }
}
