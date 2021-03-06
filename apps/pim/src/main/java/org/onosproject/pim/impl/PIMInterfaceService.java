/*
 * Copyright 2015 Open Networking Laboratory
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
package org.onosproject.pim.impl;

import org.onosproject.incubator.net.intf.Interface;
import org.onosproject.net.ConnectPoint;

/**
 * Define the PIMInterfaceService.  PIM will use ONOS Interfaces to
 * define PIM Interfaces.  The PIM Application signed up as a Netconfig
 * listener.
 *
 * TODO: Do we need a PIMInterfaceListenerService?  Who sould listen to Interfaces changes?
 */
public interface PIMInterfaceService {

    /**
     * Update the corresponding PIMInterface.  If the PIMInterface
     * does not exist it will be created.
     *
     * @param intf ONOS Interface.
     */
    public void updateInterface(Interface intf);

    /**
     * Delete the PIMInterface that corresponds to the given ConnectPoint.
     *
     * @param cp The connect point associated with this interface.
     */
    public void deleteInterface(ConnectPoint cp);

    /**
     * Return the PIMInterface associated with the given ConnectPoint.
     *
     * @param cp The ConnectPoint we want to get the PIMInterface for.
     * @return the PIMInterface if it exists, NULL if it does not exist.
     */
    public PIMInterface getPIMInterface(ConnectPoint cp);
}
