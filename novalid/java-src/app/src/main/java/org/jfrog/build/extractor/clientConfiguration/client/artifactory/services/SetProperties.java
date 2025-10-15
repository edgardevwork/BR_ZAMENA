package org.jfrog.build.extractor.clientConfiguration.client.artifactory.services;

import com.google.common.collect.ArrayListMultimap;
import java.io.IOException;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.utils.URLEncodedUtils;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.client.JFrogHttpClient;
import org.jfrog.build.extractor.UrlUtils;
import org.jfrog.build.extractor.clientConfiguration.client.JFrogService;
import org.jfrog.build.extractor.clientConfiguration.client.VoidJFrogService;
import org.jfrog.build.extractor.clientConfiguration.util.DeploymentUrlUtils;
import org.jfrog.filespecs.properties.PropertiesParser;

/* loaded from: classes7.dex */
public class SetProperties extends VoidJFrogService {
    public static final String SET_PROPERTIES_ENDPOINT = "api/storage/";
    public final boolean encodeProperties;
    public ArrayListMultimap<String, String> propertiesMap;
    public String propertiesString;
    public final String relativePath;

    public SetProperties(String str, String str2, ArrayListMultimap<String, String> arrayListMultimap, boolean z, Log log) {
        super(log);
        this.relativePath = str;
        this.propertiesMap = arrayListMultimap;
        this.propertiesString = str2;
        this.encodeProperties = z;
    }

    public SetProperties(String str, String str2, boolean z, Log log) {
        this(str, str2, null, z, log);
    }

    public SetProperties(String str, ArrayListMultimap<String, String> arrayListMultimap, boolean z, Log log) {
        this(str, null, arrayListMultimap, z, log);
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public HttpRequestBase createRequest() throws IOException {
        String string;
        String str = "api/storage/" + UrlUtils.encodeUrl(StringUtils.stripEnd(this.relativePath, "/")) + "?properties=";
        if (StringUtils.isNotEmpty(this.propertiesString)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(this.encodeProperties ? DeploymentUrlUtils.buildMatrixParamsString(mapPropsString(this.propertiesString), true) : this.propertiesString);
            string = sb.toString();
        } else {
            string = str + DeploymentUrlUtils.buildMatrixParamsString(this.propertiesMap, this.encodeProperties);
        }
        return new HttpPut(string);
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void handleUnsuccessfulResponse(HttpEntity httpEntity) throws UnsupportedOperationException, IOException {
        this.log.error("Failed to set properties to  '" + this.relativePath + "'");
        JFrogService.throwException(httpEntity, getStatusCode());
    }

    @Override // org.jfrog.build.extractor.clientConfiguration.client.JFrogService
    public void ensureRequirements(JFrogHttpClient jFrogHttpClient) throws IOException {
        if (StringUtils.isEmpty(this.propertiesString)) {
            return;
        }
        for (String str : this.propertiesString.trim().split(PropertiesParser.PROPS_SEPARATOR)) {
            if (!str.isEmpty()) {
                if (StringUtils.substringBefore(str, URLEncodedUtils.NAME_VALUE_SEPARATOR).isEmpty()) {
                    throw new IOException("Setting properties: Every property must have a key.");
                }
                String strSubstringAfter = StringUtils.substringAfter(str, URLEncodedUtils.NAME_VALUE_SEPARATOR);
                if (strSubstringAfter.isEmpty() || StringUtils.countMatches(strSubstringAfter, ",") == strSubstringAfter.length()) {
                    throw new IOException("Setting properties: Every property must have at least one value.");
                }
            }
        }
    }

    public final ArrayListMultimap<String, String> mapPropsString(String str) {
        ArrayListMultimap<String, String> arrayListMultimapCreate = ArrayListMultimap.create();
        for (String str2 : str.split(PropertiesParser.PROPS_SEPARATOR)) {
            if (StringUtils.isNotEmpty(str2)) {
                String[] strArrSplit = str2.split(URLEncodedUtils.NAME_VALUE_SEPARATOR);
                arrayListMultimapCreate.put(strArrSplit[0], strArrSplit[1]);
            }
        }
        return arrayListMultimapCreate;
    }
}
