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
package org.onosproject.net.newresource;

import com.google.common.annotations.Beta;
import com.google.common.collect.ImmutableList;

import java.util.List;

/**
 * Service for administering resource service behavior.
 */
@Beta
public interface ResourceAdminService {
    /**
     * Registers the specified resources.
     *
     * @param resources resources to be registered
     * @return true if registration is successfully done, false otherwise. Registration
     * succeeds when each resource is not registered or unallocated.
     */
    default boolean registerResources(Resource... resources) {
        return registerResources(ImmutableList.copyOf(resources));
    }

    /**
     * Registers the specified resources.
     *
     * @param resources resources to be registered
     * @return true if registration is successfully done, false otherwise. Registration
     * succeeds when each resource is not registered or unallocated.
     */
    boolean registerResources(List<Resource> resources);

    /**
     * Unregisters the specified resources.
     *
     * @param resources resources to be unregistered
     * @return true if unregistration is successfully done, false otherwise. Unregistration
     * succeeds when each resource is not registered or unallocated.
     */
    // TODO: might need to change the first argument type to ResourceId
    default boolean unregisterResources(Resource... resources) {
        return unregisterResources(ImmutableList.copyOf(resources));
    }

    /**
     * Unregisters the specified resources.
     *
     * @param resources resources to be unregistered
     * @return true if unregistration is successfully done, false otherwise. Unregistration
     * succeeds when each resource is not registered or unallocated.
     */
    // TODO: might need to change the first argument type to ResourceId
    boolean unregisterResources(List<Resource> resources);
}
