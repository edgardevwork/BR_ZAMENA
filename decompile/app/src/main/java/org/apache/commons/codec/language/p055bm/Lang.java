package org.apache.commons.codec.language.p055bm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;
import org.apache.commons.codec.Resources;
import org.apache.commons.codec.language.p055bm.Languages;

/* loaded from: classes5.dex */
public class Lang {
    public static final String LANGUAGE_RULES_RN = "org/apache/commons/codec/language/bm/%s_lang.txt";
    public static final Map<NameType, Lang> Langs = new EnumMap(NameType.class);
    public final Languages languages;
    public final List<LangRule> rules;

    public static final class LangRule {
        public final boolean acceptOnMatch;
        public final Set<String> languages;
        public final Pattern pattern;

        public LangRule(Pattern pattern, Set<String> set, boolean z) {
            this.pattern = pattern;
            this.languages = set;
            this.acceptOnMatch = z;
        }

        public boolean matches(String str) {
            return this.pattern.matcher(str).find();
        }
    }

    static {
        for (NameType nameType : NameType.values()) {
            Langs.put(nameType, loadFromResource(String.format(LANGUAGE_RULES_RN, nameType.getName()), Languages.getInstance(nameType)));
        }
    }

    public static Lang instance(NameType nameType) {
        return Langs.get(nameType);
    }

    public static Lang loadFromResource(String str, Languages languages) {
        ArrayList arrayList = new ArrayList();
        Scanner scanner = new Scanner(Resources.getInputStream(str), "UTF-8");
        while (true) {
            boolean z = false;
            while (scanner.hasNextLine()) {
                try {
                    String strNextLine = scanner.nextLine();
                    if (z) {
                        if (strNextLine.endsWith("*/")) {
                            break;
                        }
                    } else if (strNextLine.startsWith("/*")) {
                        z = true;
                    } else {
                        int iIndexOf = strNextLine.indexOf("//");
                        String strTrim = (iIndexOf >= 0 ? strNextLine.substring(0, iIndexOf) : strNextLine).trim();
                        if (strTrim.length() != 0) {
                            String[] strArrSplit = strTrim.split("\\s+");
                            if (strArrSplit.length != 3) {
                                throw new IllegalArgumentException("Malformed line '" + strNextLine + "' in language resource '" + str + "'");
                            }
                            arrayList.add(new LangRule(Pattern.compile(strArrSplit[0]), new HashSet(Arrays.asList(strArrSplit[1].split("\\+"))), strArrSplit[2].equals("true")));
                        }
                    }
                } finally {
                }
            }
            scanner.close();
            return new Lang(arrayList, languages);
        }
    }

    public Lang(List<LangRule> list, Languages languages) {
        this.rules = Collections.unmodifiableList(list);
        this.languages = languages;
    }

    public String guessLanguage(String str) {
        Languages.LanguageSet languageSetGuessLanguages = guessLanguages(str);
        return languageSetGuessLanguages.isSingleton() ? languageSetGuessLanguages.getAny() : Languages.ANY;
    }

    public Languages.LanguageSet guessLanguages(String str) {
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        HashSet hashSet = new HashSet(this.languages.getLanguages());
        for (LangRule langRule : this.rules) {
            if (langRule.matches(lowerCase)) {
                if (langRule.acceptOnMatch) {
                    hashSet.retainAll(langRule.languages);
                } else {
                    hashSet.removeAll(langRule.languages);
                }
            }
        }
        Languages.LanguageSet languageSetFrom = Languages.LanguageSet.from(hashSet);
        return languageSetFrom.equals(Languages.NO_LANGUAGES) ? Languages.ANY_LANGUAGE : languageSetFrom;
    }
}
