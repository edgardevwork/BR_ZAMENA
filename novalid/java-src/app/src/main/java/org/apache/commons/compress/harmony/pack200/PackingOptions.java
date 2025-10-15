package org.apache.commons.compress.harmony.pack200;

import com.google.common.reflect.ClassPath;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.commons.compress.harmony.pack200.NewAttribute;
import org.apache.commons.compress.java.util.jar.Pack200;
import org.objectweb.asm.Attribute;

/* loaded from: classes7.dex */
public class PackingOptions {
    public static final Attribute[] EMPTY_ATTRIBUTE_ARRAY = new Attribute[0];
    public static final String ERROR = "error";
    public static final String KEEP = "keep";
    public static final String PASS = "pass";
    public static final long SEGMENT_LIMIT = 1000000;
    public static final String STRIP = "strip";
    public String logFile;
    public boolean stripDebug;
    public Attribute[] unknownAttributeTypes;
    public boolean verbose;
    public boolean gzip = true;
    public boolean keepFileOrder = true;
    public long segmentLimit = 1000000;
    public int effort = 5;
    public String deflateHint = "keep";
    public String modificationTime = "keep";
    public final List<String> passFiles = new ArrayList();
    public String unknownAttributeAction = "pass";
    public final Map<String, String> classAttributeActions = new HashMap();
    public final Map<String, String> fieldAttributeActions = new HashMap();
    public final Map<String, String> methodAttributeActions = new HashMap();
    public final Map<String, String> codeAttributeActions = new HashMap();

    public void addClassAttributeAction(String str, String str2) {
        this.classAttributeActions.put(str, str2);
    }

    public void addCodeAttributeAction(String str, String str2) {
        this.codeAttributeActions.put(str, str2);
    }

    public void addFieldAttributeAction(String str, String str2) {
        this.fieldAttributeActions.put(str, str2);
    }

    public void addMethodAttributeAction(String str, String str2) {
        this.methodAttributeActions.put(str, str2);
    }

    public final void addOrUpdateAttributeActions(List<Attribute> list, Map<String, String> map, int i) {
        NewAttribute newAttribute;
        if (map == null || map.size() <= 0) {
            return;
        }
        for (String str : map.keySet()) {
            String str2 = map.get(str);
            Iterator<Attribute> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    NewAttribute newAttribute2 = (NewAttribute) it.next();
                    if (newAttribute2.type.equals(str)) {
                        newAttribute2.addContext(i);
                        break;
                    }
                } else {
                    if ("error".equals(str2)) {
                        newAttribute = new NewAttribute.ErrorAttribute(str, i);
                    } else if ("strip".equals(str2)) {
                        newAttribute = new NewAttribute.StripAttribute(str, i);
                    } else if ("pass".equals(str2)) {
                        newAttribute = new NewAttribute.PassAttribute(str, i);
                    } else {
                        newAttribute = new NewAttribute(str, str2, i);
                    }
                    list.add(newAttribute);
                }
            }
        }
    }

    public void addPassFile(String str) {
        String property = System.getProperty("file.separator");
        if (property.equals("\\")) {
            property = property + "\\";
        }
        this.passFiles.add(str.replaceAll(property, "/"));
    }

    public String getDeflateHint() {
        return this.deflateHint;
    }

    public int getEffort() {
        return this.effort;
    }

    public String getLogFile() {
        return this.logFile;
    }

    public String getModificationTime() {
        return this.modificationTime;
    }

    public final String getOrDefault(Map<String, String> map, String str, String str2) {
        return map == null ? str2 : map.getOrDefault(str, str2);
    }

    public long getSegmentLimit() {
        return this.segmentLimit;
    }

    public String getUnknownAttributeAction() {
        return this.unknownAttributeAction;
    }

    public Attribute[] getUnknownAttributePrototypes() {
        if (this.unknownAttributeTypes == null) {
            ArrayList arrayList = new ArrayList();
            addOrUpdateAttributeActions(arrayList, this.classAttributeActions, 0);
            addOrUpdateAttributeActions(arrayList, this.methodAttributeActions, 2);
            addOrUpdateAttributeActions(arrayList, this.fieldAttributeActions, 1);
            addOrUpdateAttributeActions(arrayList, this.codeAttributeActions, 3);
            this.unknownAttributeTypes = (Attribute[]) arrayList.toArray(EMPTY_ATTRIBUTE_ARRAY);
        }
        return this.unknownAttributeTypes;
    }

    public String getUnknownClassAttributeAction(String str) {
        return getOrDefault(this.classAttributeActions, str, this.unknownAttributeAction);
    }

    public String getUnknownCodeAttributeAction(String str) {
        return getOrDefault(this.codeAttributeActions, str, this.unknownAttributeAction);
    }

    public String getUnknownFieldAttributeAction(String str) {
        return getOrDefault(this.fieldAttributeActions, str, this.unknownAttributeAction);
    }

    public String getUnknownMethodAttributeAction(String str) {
        return getOrDefault(this.methodAttributeActions, str, this.unknownAttributeAction);
    }

    public boolean isGzip() {
        return this.gzip;
    }

    public boolean isKeepDeflateHint() {
        return "keep".equals(this.deflateHint);
    }

    public boolean isKeepFileOrder() {
        return this.keepFileOrder;
    }

    public boolean isPassFile(String str) {
        Iterator<String> it = this.passFiles.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (str.equals(next)) {
                return true;
            }
            if (!next.endsWith(ClassPath.CLASS_FILE_NAME_EXTENSION)) {
                if (!next.endsWith("/")) {
                    next = next + "/";
                }
                return str.startsWith(next);
            }
        }
        return false;
    }

    public boolean isStripDebug() {
        return this.stripDebug;
    }

    public boolean isVerbose() {
        return this.verbose;
    }

    public void removePassFile(String str) {
        this.passFiles.remove(str);
    }

    public void setDeflateHint(String str) {
        if (!"keep".equals(str) && !"true".equals(str) && !"false".equals(str)) {
            throw new IllegalArgumentException("Bad argument: -H " + str + " ? deflate hint should be either true, false or keep (default)");
        }
        this.deflateHint = str;
    }

    public void setEffort(int i) {
        this.effort = i;
    }

    public void setGzip(boolean z) {
        this.gzip = z;
    }

    public void setKeepFileOrder(boolean z) {
        this.keepFileOrder = z;
    }

    public void setLogFile(String str) {
        this.logFile = str;
    }

    public void setModificationTime(String str) {
        if (!"keep".equals(str) && !Pack200.Packer.LATEST.equals(str)) {
            throw new IllegalArgumentException("Bad argument: -m " + str + " ? transmit modtimes should be either latest or keep (default)");
        }
        this.modificationTime = str;
    }

    public void setQuiet(boolean z) {
        this.verbose = !z;
    }

    public void setSegmentLimit(long j) {
        this.segmentLimit = j;
    }

    public void setStripDebug(boolean z) {
        this.stripDebug = z;
    }

    public void setUnknownAttributeAction(String str) {
        this.unknownAttributeAction = str;
        if ("pass".equals(str) || "error".equals(str) || "strip".equals(str)) {
            return;
        }
        throw new IllegalArgumentException("Incorrect option for -U, " + str);
    }

    public void setVerbose(boolean z) {
        this.verbose = z;
    }
}
