/*
 * SoapUI, Copyright (C) 2004-2022 SmartBear Software
 *
 * Licensed under the EUPL, Version 1.1 or - as soon as they will be approved by the European Commission - subsequent 
 * versions of the EUPL (the "Licence"); 
 * You may not use this work except in compliance with the Licence. 
 * You may obtain a copy of the Licence at: 
 * 
 * http://ec.europa.eu/idabc/eupl 
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the Licence is 
 * distributed on an "AS IS" basis, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either 
 * express or implied. See the Licence for the specific language governing permissions and limitations 
 * under the Licence. 
 */

package com.eviware.soapui.impl.wsdl.actions.loadtest;

import com.eviware.soapui.impl.wsdl.loadtest.WsdlLoadTest;
import com.eviware.soapui.support.UISupport;
import com.eviware.soapui.support.action.support.AbstractSoapUIAction;

/**
 * Renames a WsdlLoadTest
 *
 * @author Ole.Matzura
 */

public class RenameLoadTestAction extends AbstractSoapUIAction<WsdlLoadTest> {
    public RenameLoadTestAction() {
        super("Rename", "Renames this LoadTest");
    }

    public void perform(WsdlLoadTest loadTest, Object param) {
        String name = UISupport.prompt("Specify name of LoadTest", "Rename LoadTest", loadTest.getName());
        if (name == null || name.equals(loadTest.getName())) {
            return;
        }

        loadTest.setName(name);
    }
}
