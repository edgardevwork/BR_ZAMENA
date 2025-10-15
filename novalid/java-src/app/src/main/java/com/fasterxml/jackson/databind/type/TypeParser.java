package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/* loaded from: classes3.dex */
public class TypeParser implements Serializable {
    public static final long serialVersionUID = 1;
    public final TypeFactory _factory;

    public TypeParser(TypeFactory typeFactory) {
        this._factory = typeFactory;
    }

    public TypeParser withFactory(TypeFactory typeFactory) {
        return typeFactory == this._factory ? this : new TypeParser(typeFactory);
    }

    public JavaType parse(String str) throws IllegalArgumentException {
        MyTokenizer myTokenizer = new MyTokenizer(str.trim());
        JavaType type = parseType(myTokenizer);
        if (myTokenizer.hasMoreTokens()) {
            throw _problem(myTokenizer, "Unexpected tokens after complete type");
        }
        return type;
    }

    public JavaType parseType(MyTokenizer myTokenizer) throws IllegalArgumentException {
        if (!myTokenizer.hasMoreTokens()) {
            throw _problem(myTokenizer, "Unexpected end-of-string");
        }
        Class<?> clsFindClass = findClass(myTokenizer.nextToken(), myTokenizer);
        if (myTokenizer.hasMoreTokens()) {
            String strNextToken = myTokenizer.nextToken();
            if ("<".equals(strNextToken)) {
                return this._factory._fromClass(null, clsFindClass, TypeBindings.create(clsFindClass, parseTypes(myTokenizer)));
            }
            myTokenizer.pushBack(strNextToken);
        }
        return this._factory._fromClass(null, clsFindClass, TypeBindings.emptyBindings());
    }

    public List<JavaType> parseTypes(MyTokenizer myTokenizer) throws IllegalArgumentException {
        ArrayList arrayList = new ArrayList();
        while (myTokenizer.hasMoreTokens()) {
            arrayList.add(parseType(myTokenizer));
            if (!myTokenizer.hasMoreTokens()) {
                break;
            }
            String strNextToken = myTokenizer.nextToken();
            if (">".equals(strNextToken)) {
                return arrayList;
            }
            if (!",".equals(strNextToken)) {
                throw _problem(myTokenizer, "Unexpected token '" + strNextToken + "', expected ',' or '>')");
            }
        }
        throw _problem(myTokenizer, "Unexpected end-of-string");
    }

    public Class<?> findClass(String str, MyTokenizer myTokenizer) {
        try {
            return this._factory.findClass(str);
        } catch (Exception e) {
            ClassUtil.throwIfRTE(e);
            throw _problem(myTokenizer, "Cannot locate class '" + str + "', problem: " + e.getMessage());
        }
    }

    public IllegalArgumentException _problem(MyTokenizer myTokenizer, String str) {
        return new IllegalArgumentException(String.format("Failed to parse type '%s' (remaining: '%s'): %s", myTokenizer.getAllInput(), myTokenizer.getRemainingInput(), str));
    }

    public static final class MyTokenizer extends StringTokenizer {
        public int _index;
        public final String _input;
        public String _pushbackToken;

        public MyTokenizer(String str) {
            super(str, "<,>", true);
            this._input = str;
        }

        @Override // java.util.StringTokenizer
        public boolean hasMoreTokens() {
            return this._pushbackToken != null || super.hasMoreTokens();
        }

        @Override // java.util.StringTokenizer
        public String nextToken() {
            String str = this._pushbackToken;
            if (str != null) {
                this._pushbackToken = null;
                return str;
            }
            String strNextToken = super.nextToken();
            this._index += strNextToken.length();
            return strNextToken.trim();
        }

        public void pushBack(String str) {
            this._pushbackToken = str;
        }

        public String getAllInput() {
            return this._input;
        }

        public String getRemainingInput() {
            return this._input.substring(this._index);
        }
    }
}
