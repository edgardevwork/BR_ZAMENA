package org.jfrog.build.extractor.clientConfiguration;

import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.jfrog.build.api.util.Log;

/* loaded from: classes7.dex */
public class PrefixPropertyHandler {
    public final Log log;
    public final String prefix;
    public final Map<String, String> props;

    public PrefixPropertyHandler(Log log, Map<String, String> map) {
        this(log, map, "");
    }

    public PrefixPropertyHandler(PrefixPropertyHandler prefixPropertyHandler, String str) {
        this(prefixPropertyHandler.log, prefixPropertyHandler.props, str);
    }

    public PrefixPropertyHandler(Log log, Map<String, String> map, String str) {
        this.log = log;
        this.props = map;
        this.prefix = str;
    }

    public Log getLog() {
        return this.log;
    }

    public String getPrefix() {
        return this.prefix;
    }

    public String getDeprecatedPrefix() {
        return ClientProperties.ARTIFACTORY_PREFIX + this.prefix;
    }

    public String getStringValue(String str) {
        return getStringValue(str, null);
    }

    public String getStringValue(String str, String str2) {
        String valueWithFallback = getValueWithFallback(str);
        return StringUtils.isNotBlank(valueWithFallback) ? valueWithFallback : str2;
    }

    public void setStringValue(String str, String str2) {
        if (str2 == null) {
            this.props.remove(this.prefix + str);
            return;
        }
        this.props.put(this.prefix + str, str2);
    }

    public Boolean getBooleanValue(String str, Boolean bool) {
        String valueWithFallback = getValueWithFallback(str);
        Boolean boolValueOf = valueWithFallback == null ? null : Boolean.valueOf(Boolean.parseBoolean(valueWithFallback));
        return boolValueOf != null ? boolValueOf : bool;
    }

    public void setBooleanValue(String str, Boolean bool) {
        if (bool == null) {
            this.props.remove(this.prefix + str);
            return;
        }
        this.props.put(this.prefix + str, bool.toString());
    }

    public void setLegacyBooleanValue(String str, Boolean bool) {
        if (bool == null) {
            this.props.remove(getDeprecatedPrefix() + str);
            return;
        }
        this.props.put(getDeprecatedPrefix() + str, bool.toString());
    }

    public Integer getIntegerValue(String str) {
        return getIntegerValue(str, null);
    }

    public Integer getIntegerValue(String str, Integer num) {
        Integer integer = getInteger(str);
        return integer != null ? integer : num;
    }

    public final Integer getInteger(String str) {
        String valueWithFallback = getValueWithFallback(str);
        if (valueWithFallback == null || StringUtils.isNumeric(valueWithFallback)) {
            if (valueWithFallback == null) {
                return null;
            }
            return Integer.valueOf(Integer.parseInt(valueWithFallback));
        }
        this.log.debug("Property '" + str + "' is not of numeric value '" + valueWithFallback + "'");
        return null;
    }

    public final String getValueWithFallback(String str) {
        String str2 = this.props.get(ClientProperties.ARTIFACTORY_PREFIX + this.prefix + str);
        if (StringUtils.isNotBlank(str2)) {
            return str2;
        }
        return this.props.get(this.prefix + str);
    }

    public void setIntegerValue(String str, Integer num) {
        if (num == null) {
            this.props.remove(this.prefix + str);
            return;
        }
        this.props.put(this.prefix + str, num.toString());
    }

    public Map<String, String> getProps() {
        return this.props;
    }
}
