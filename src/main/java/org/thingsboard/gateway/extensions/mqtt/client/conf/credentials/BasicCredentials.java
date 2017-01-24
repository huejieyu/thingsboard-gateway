/**
 * Copyright © ${project.inceptionYear}-2017 The Thingsboard Authors
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
package org.thingsboard.gateway.extensions.mqtt.client.conf.credentials;

import lombok.Data;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.springframework.util.StringUtils;

/**
 * Created by ashvayka on 23.01.17.
 */
@Data
public class BasicCredentials implements MqttClientCredentials {

    private String username;
    private String password;

    @Override
    public void configure(MqttConnectOptions clientOptions) {
        clientOptions.setUserName(username);
        if (!StringUtils.isEmpty(password)) {
            clientOptions.setPassword(password.toCharArray());
        }
    }
}
