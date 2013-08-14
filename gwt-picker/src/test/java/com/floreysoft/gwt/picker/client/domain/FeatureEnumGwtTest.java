/*
 * Copyright 2011 floreysoft GmbH (www.floreysoft.net)
 *
 * Written by Sergej Soller (ssoller@q-ric.de)
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.floreysoft.gwt.picker.client.domain;

import com.floreysoft.gwt.picker.client.PickerEnumTestCase;

public class FeatureEnumGwtTest extends PickerEnumTestCase {

  public void testFeatureEnum() {
    for (Feature feature : Feature.values()) {
      assertEquals(feature.name(), feature.getValue());
    }
  }

  @Override
  protected native void setupEnumValues() /*-{
    $wnd.google.picker.Feature = {
      MULTISELECT_ENABLED: 'MULTISELECT_ENABLED',
      NAV_HIDDEN: 'NAV_HIDDEN',
      SIMPLE_UPLOAD_ENABLED: 'SIMPLE_UPLOAD_ENABLED'
    };
  }-*/;
}
