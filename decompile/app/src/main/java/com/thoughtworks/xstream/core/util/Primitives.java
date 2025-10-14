package com.thoughtworks.xstream.core.util;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class Primitives {
    public static /* synthetic */ Class class$java$lang$Boolean;
    public static /* synthetic */ Class class$java$lang$Byte;
    public static /* synthetic */ Class class$java$lang$Character;
    public static /* synthetic */ Class class$java$lang$Double;
    public static /* synthetic */ Class class$java$lang$Float;
    public static /* synthetic */ Class class$java$lang$Integer;
    public static /* synthetic */ Class class$java$lang$Long;
    public static /* synthetic */ Class class$java$lang$Short;
    public static /* synthetic */ Class class$java$lang$Void;
    public static final Map BOX = new HashMap();
    public static final Map UNBOX = new HashMap();
    public static final Map NAMED_PRIMITIVE = new HashMap();
    public static final Map REPRESENTING_CHAR = new HashMap();

    static {
        Class cls = Byte.TYPE;
        Class clsClass$ = class$java$lang$Byte;
        if (clsClass$ == null) {
            clsClass$ = class$("java.lang.Byte");
            class$java$lang$Byte = clsClass$;
        }
        Class[] clsArr = {cls, clsClass$};
        Class cls2 = Character.TYPE;
        Class clsClass$2 = class$java$lang$Character;
        if (clsClass$2 == null) {
            clsClass$2 = class$("java.lang.Character");
            class$java$lang$Character = clsClass$2;
        }
        Class[] clsArr2 = {cls2, clsClass$2};
        Class cls3 = Short.TYPE;
        Class clsClass$3 = class$java$lang$Short;
        if (clsClass$3 == null) {
            clsClass$3 = class$("java.lang.Short");
            class$java$lang$Short = clsClass$3;
        }
        Class[] clsArr3 = {cls3, clsClass$3};
        Class cls4 = Integer.TYPE;
        Class clsClass$4 = class$java$lang$Integer;
        if (clsClass$4 == null) {
            clsClass$4 = class$("java.lang.Integer");
            class$java$lang$Integer = clsClass$4;
        }
        Class[] clsArr4 = {cls4, clsClass$4};
        Class cls5 = Long.TYPE;
        Class clsClass$5 = class$java$lang$Long;
        if (clsClass$5 == null) {
            clsClass$5 = class$("java.lang.Long");
            class$java$lang$Long = clsClass$5;
        }
        Class[] clsArr5 = {cls5, clsClass$5};
        Class cls6 = Float.TYPE;
        Class clsClass$6 = class$java$lang$Float;
        if (clsClass$6 == null) {
            clsClass$6 = class$("java.lang.Float");
            class$java$lang$Float = clsClass$6;
        }
        Class[] clsArr6 = {cls6, clsClass$6};
        Class cls7 = Double.TYPE;
        Class clsClass$7 = class$java$lang$Double;
        if (clsClass$7 == null) {
            clsClass$7 = class$("java.lang.Double");
            class$java$lang$Double = clsClass$7;
        }
        Class[] clsArr7 = {cls7, clsClass$7};
        Class cls8 = Boolean.TYPE;
        Class clsClass$8 = class$java$lang$Boolean;
        if (clsClass$8 == null) {
            clsClass$8 = class$("java.lang.Boolean");
            class$java$lang$Boolean = clsClass$8;
        }
        Class[] clsArr8 = {cls8, clsClass$8};
        Class cls9 = Void.TYPE;
        Class clsClass$9 = class$java$lang$Void;
        if (clsClass$9 == null) {
            clsClass$9 = class$("java.lang.Void");
            class$java$lang$Void = clsClass$9;
        }
        Class[][] clsArr9 = {clsArr, clsArr2, clsArr3, clsArr4, clsArr5, clsArr6, clsArr7, clsArr8, new Class[]{cls9, clsClass$9}};
        Character[] chArr = {new Character('B'), new Character('C'), new Character('S'), new Character('I'), new Character('J'), new Character('F'), new Character('D'), new Character('Z'), null};
        for (int i = 0; i < 9; i++) {
            Class[] clsArr10 = clsArr9[i];
            Class cls10 = clsArr10[0];
            Class cls11 = clsArr10[1];
            BOX.put(cls10, cls11);
            UNBOX.put(cls11, cls10);
            NAMED_PRIMITIVE.put(cls10.getName(), cls10);
            REPRESENTING_CHAR.put(cls10, chArr[i]);
        }
    }

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    public static Class box(Class cls) {
        return (Class) BOX.get(cls);
    }

    public static Class unbox(Class cls) {
        return (Class) UNBOX.get(cls);
    }

    public static boolean isBoxed(Class cls) {
        return UNBOX.containsKey(cls);
    }

    public static Class primitiveType(String str) {
        return (Class) NAMED_PRIMITIVE.get(str);
    }

    public static char representingChar(Class cls) {
        Character ch = (Character) REPRESENTING_CHAR.get(cls);
        if (ch == null) {
            return (char) 0;
        }
        return ch.charValue();
    }
}
