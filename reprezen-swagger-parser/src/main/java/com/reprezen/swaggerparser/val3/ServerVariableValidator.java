package com.reprezen.swaggerparser.val3;

import javax.lang.model.type.NullType;

import com.reprezen.swaggerparser.model3.ServerVariable;
import com.reprezen.swaggerparser.val.Messages;
import com.reprezen.swaggerparser.val.ObjectValidatorBase;
import com.reprezen.swaggerparser.val.ValidationResults;

public class ServerVariableValidator extends ObjectValidatorBase<ServerVariable> {

    @Override
    public void validateModel(final ServerVariable variable, final ValidationResults results) {
        results.withCrumb("enum", new Runnable() {
            @Override
            public void run() {
                int i = 0;
                for (Object primitive : variable.getEnumValues()) {
                    checkPrimitive(primitive, results, i++);
                }
            }
        });
        results.withCrumb("default", new Runnable() {
            @Override
            public void run() {
                checkPrimitive(variable.getDefault(), results, "default");
            }
        });
        validateString(variable.getDescription(), results, false, null, "description");
    }

    private void checkPrimitive(Object primitive, ValidationResults results, int index) {
        checkPrimitive(primitive, results, "[" + index + "]");
    }

    private void checkPrimitive(final Object primitive, ValidationResults results, String crumb) {
        if (!(primitive instanceof String || primitive instanceof Number || primitive instanceof Boolean)) {
            results.withCrumb(crumb, new Runnable() {
                @Override
                public void run() {
                    Messages.m.msg("BadPrimtive|Invalid primtive value", String.valueOf(primitive),
                            (primitive != null ? primitive.getClass() : NullType.class).getName());
                }
            });
        }
    }
}
