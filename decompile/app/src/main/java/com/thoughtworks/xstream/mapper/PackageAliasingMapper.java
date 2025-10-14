package com.thoughtworks.xstream.mapper;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes8.dex */
public class PackageAliasingMapper extends MapperWrapper implements Serializable {
    public static final Comparator REVERSE = new Comparator() { // from class: com.thoughtworks.xstream.mapper.PackageAliasingMapper.1
        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((String) obj2).compareTo((String) obj);
        }
    };
    public transient Map nameToPackage;
    public Map packageToName;

    public PackageAliasingMapper(Mapper mapper) {
        super(mapper);
        this.packageToName = new TreeMap(REVERSE);
        this.nameToPackage = new HashMap();
    }

    public void addPackageAlias(String str, String str2) {
        if (str.length() > 0 && str.charAt(str.length() - 1) != '.') {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(str);
            stringBuffer.append('.');
            str = stringBuffer.toString();
        }
        if (str2.length() > 0 && str2.charAt(str2.length() - 1) != '.') {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(str2);
            stringBuffer2.append('.');
            str2 = stringBuffer2.toString();
        }
        this.nameToPackage.put(str, str2);
        this.packageToName.put(str2, str);
    }

    @Override // com.thoughtworks.xstream.mapper.MapperWrapper, com.thoughtworks.xstream.mapper.Mapper
    public String serializedClass(Class cls) {
        String name = cls.getName();
        int length = name.length();
        while (true) {
            int iLastIndexOf = name.lastIndexOf(46, length);
            String str = (String) this.packageToName.get(iLastIndexOf < 0 ? "" : name.substring(0, iLastIndexOf + 1));
            if (str != null) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(str);
                if (iLastIndexOf >= 0) {
                    name = name.substring(iLastIndexOf + 1);
                }
                stringBuffer.append(name);
                return stringBuffer.toString();
            }
            int i = iLastIndexOf - 1;
            if (iLastIndexOf < 0) {
                return super.serializedClass(cls);
            }
            length = i;
        }
    }

    @Override // com.thoughtworks.xstream.mapper.MapperWrapper, com.thoughtworks.xstream.mapper.Mapper
    public Class realClass(String str) {
        String string;
        int length = str.length();
        while (true) {
            int iLastIndexOf = str.lastIndexOf(46, length);
            if (iLastIndexOf < 0) {
                string = "";
            } else {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(str.substring(0, iLastIndexOf));
                stringBuffer.append('.');
                string = stringBuffer.toString();
            }
            String str2 = (String) this.nameToPackage.get(string);
            if (str2 != null) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append(str2);
                if (iLastIndexOf >= 0) {
                    str = str.substring(iLastIndexOf + 1);
                }
                stringBuffer2.append(str);
                str = stringBuffer2.toString();
            } else {
                int i = iLastIndexOf - 1;
                if (iLastIndexOf < 0) {
                    break;
                }
                length = i;
            }
        }
        return super.realClass(str);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeObject(new HashMap(this.packageToName));
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        TreeMap treeMap = new TreeMap(REVERSE);
        this.packageToName = treeMap;
        treeMap.putAll((Map) objectInputStream.readObject());
        this.nameToPackage = new HashMap();
        for (Object obj : this.packageToName.keySet()) {
            this.nameToPackage.put(this.packageToName.get(obj), obj);
        }
    }
}
