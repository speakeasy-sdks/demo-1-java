/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package demo_1.test_1.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ValueSetVersionResultOfEnum {
    APP_VALUE_CREATE("app_value_create"),
    APP_VALUE_UPDATE("app_value_update"),
    APP_VALUE_DELETE("app_value_delete"),
    APP_VALUES_DELETE("app_values_delete"),
    APP_VALUE_SET_VERSION_RESTORE("app_value_set_version_restore"),
    APP_VALUE_SET_VERSION_PURGE("app_value_set_version_purge"),
    ENV_VALUE_CREATE("env_value_create"),
    ENV_VALUE_UPDATE("env_value_update"),
    ENV_VALUE_DELETE("env_value_delete"),
    ENV_VALUES_DELETE("env_values_delete"),
    ENV_VALUE_SET_VERSION_RESTORE("env_value_set_version_restore"),
    ENV_VALUE_SET_VERSION_PURGE("env_value_set_version_purge");

    @JsonValue
    public final String value;

    private ValueSetVersionResultOfEnum(String value) {
        this.value = value;
    }
}
