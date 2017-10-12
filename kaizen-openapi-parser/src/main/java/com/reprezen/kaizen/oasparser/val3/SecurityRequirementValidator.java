/*******************************************************************************
 *  Copyright (c) 2017 ModelSolv, Inc. and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *     ModelSolv, Inc. - initial API and implementation and/or initial documentation
 *******************************************************************************/
package com.reprezen.kaizen.oasparser.val3;

import com.reprezen.kaizen.oasparser.model3.SecurityRequirement;
import com.reprezen.kaizen.oasparser.val.ObjectValidatorBase;
import com.reprezen.kaizen.oasparser.val.ValidationResults;

public class SecurityRequirementValidator extends ObjectValidatorBase<SecurityRequirement> {

	@Override
	public void validateObject(SecurityRequirement securityRequirement, ValidationResults results) {
		// TODO wait for getModel
		// OpenApi3 model = securityRequirement.getModel(false);
		// Set<String> definedSchemes = model.getSecuritySchemes(false).keySet();
		// for (Entry<String, ? extends SecurityParameter> entry :
		// securityRequirement.getRequirements(false).entrySet()) {
		// if (!definedSchemes.contains(entry.getKey(false))) {
		// results.addError(
		// m.msg("UnkSecScheme|Security scheme not defined in components object",
		// entry.getKey(false)));
		// } else {
		// String type = model.getSecurityScheme(entry.getKey(false)).getType(false);
		// switch (type) {
		// case "oauth2":
		// case "openIdConnect":
		// // TODO Q: anything to test here? do we know what the allowed scope names
		// are?
		// break;
		// default:
		// if (!entry.getValue(false).getParameters(false).isEmpty()) {
		// results.addError(
		// m.msg("NonEmptySecReqParms|Security requirement parameters must be empty
		// unless scheme type is oauth2 or openIdConnect",
		// entry.getKey(false), type));
		// }
		//
		// }
		// }
		// }
	}
}
