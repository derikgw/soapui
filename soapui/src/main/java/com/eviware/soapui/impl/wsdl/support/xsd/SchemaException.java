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

package com.eviware.soapui.impl.wsdl.support.xsd;

import java.util.ArrayList;

/**
 * Exception thrown by schema-related operations
 *
 * @author Ole.Matzura
 */

public class SchemaException extends Exception {
    private ArrayList<?> errorList;

    public SchemaException(String message, Throwable cause) {
        super(message, cause);
    }

    public SchemaException(Exception e, ArrayList<?> errorList) {
        this.errorList = errorList;
    }

    public ArrayList<?> getErrorList() {
        return errorList;
    }
}
