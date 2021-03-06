/*
 * Copyright 2012 The Netty Project
 *
 * The Netty Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package io.netty.logging;


import org.jboss.logging.Logger;

/**
 * Logger factory which creates a
 * <a href="http://anonsvn.jboss.org/repos/common/common-logging-spi/">JBoss Logging</a>
 * logger.
 */
public class JBossLoggerFactory extends InternalLoggerFactory {

    @Override
    public InternalLogger newInstance(String name) {
        final Logger logger =
            Logger.getLogger(name);
        return new JBossLogger(logger);
    }
}
