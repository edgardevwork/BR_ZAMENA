package org.apache.commons.codec.language.p055bm;

import java.util.Collections;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Set;
import org.apache.commons.codec.Resources;

/* loaded from: classes5.dex */
public class Languages {
    public static final String ANY = "any";
    public static final LanguageSet ANY_LANGUAGE;
    public static final Map<NameType, Languages> LANGUAGES = new EnumMap(NameType.class);
    public static final LanguageSet NO_LANGUAGES;
    public final Set<String> languages;

    public static abstract class LanguageSet {
        public abstract boolean contains(String str);

        public abstract String getAny();

        public abstract boolean isEmpty();

        public abstract boolean isSingleton();

        public abstract LanguageSet merge(LanguageSet languageSet);

        public abstract LanguageSet restrictTo(LanguageSet languageSet);

        public static LanguageSet from(Set<String> set) {
            return set.isEmpty() ? Languages.NO_LANGUAGES : new SomeLanguages(set);
        }
    }

    /* loaded from: classes8.dex */
    public static final class SomeLanguages extends LanguageSet {
        public final Set<String> languages;

        public SomeLanguages(Set<String> set) {
            this.languages = Collections.unmodifiableSet(set);
        }

        @Override // org.apache.commons.codec.language.bm.Languages.LanguageSet
        public boolean contains(String str) {
            return this.languages.contains(str);
        }

        @Override // org.apache.commons.codec.language.bm.Languages.LanguageSet
        public String getAny() {
            return this.languages.iterator().next();
        }

        public Set<String> getLanguages() {
            return this.languages;
        }

        @Override // org.apache.commons.codec.language.bm.Languages.LanguageSet
        public boolean isEmpty() {
            return this.languages.isEmpty();
        }

        @Override // org.apache.commons.codec.language.bm.Languages.LanguageSet
        public boolean isSingleton() {
            return this.languages.size() == 1;
        }

        @Override // org.apache.commons.codec.language.bm.Languages.LanguageSet
        public LanguageSet restrictTo(LanguageSet languageSet) {
            if (languageSet == Languages.NO_LANGUAGES) {
                return languageSet;
            }
            if (languageSet == Languages.ANY_LANGUAGE) {
                return this;
            }
            SomeLanguages someLanguages = (SomeLanguages) languageSet;
            HashSet hashSet = new HashSet(Math.min(this.languages.size(), someLanguages.languages.size()));
            for (String str : this.languages) {
                if (someLanguages.languages.contains(str)) {
                    hashSet.add(str);
                }
            }
            return LanguageSet.from(hashSet);
        }

        @Override // org.apache.commons.codec.language.bm.Languages.LanguageSet
        public LanguageSet merge(LanguageSet languageSet) {
            if (languageSet == Languages.NO_LANGUAGES) {
                return this;
            }
            if (languageSet == Languages.ANY_LANGUAGE) {
                return languageSet;
            }
            HashSet hashSet = new HashSet(this.languages);
            Iterator<String> it = ((SomeLanguages) languageSet).languages.iterator();
            while (it.hasNext()) {
                hashSet.add(it.next());
            }
            return LanguageSet.from(hashSet);
        }

        public String toString() {
            return "Languages(" + this.languages.toString() + ")";
        }
    }

    static {
        for (NameType nameType : NameType.values()) {
            LANGUAGES.put(nameType, getInstance(langResourceName(nameType)));
        }
        NO_LANGUAGES = new LanguageSet() { // from class: org.apache.commons.codec.language.bm.Languages.1
            @Override // org.apache.commons.codec.language.bm.Languages.LanguageSet
            public boolean contains(String str) {
                return false;
            }

            @Override // org.apache.commons.codec.language.bm.Languages.LanguageSet
            public boolean isEmpty() {
                return true;
            }

            @Override // org.apache.commons.codec.language.bm.Languages.LanguageSet
            public boolean isSingleton() {
                return false;
            }

            @Override // org.apache.commons.codec.language.bm.Languages.LanguageSet
            public LanguageSet merge(LanguageSet languageSet) {
                return languageSet;
            }

            @Override // org.apache.commons.codec.language.bm.Languages.LanguageSet
            public LanguageSet restrictTo(LanguageSet languageSet) {
                return this;
            }

            @Override // org.apache.commons.codec.language.bm.Languages.LanguageSet
            public String getAny() {
                throw new NoSuchElementException("Can't fetch any language from the empty language set.");
            }

            public String toString() {
                return "NO_LANGUAGES";
            }
        };
        ANY_LANGUAGE = new LanguageSet() { // from class: org.apache.commons.codec.language.bm.Languages.2
            @Override // org.apache.commons.codec.language.bm.Languages.LanguageSet
            public boolean contains(String str) {
                return true;
            }

            @Override // org.apache.commons.codec.language.bm.Languages.LanguageSet
            public boolean isEmpty() {
                return false;
            }

            @Override // org.apache.commons.codec.language.bm.Languages.LanguageSet
            public boolean isSingleton() {
                return false;
            }

            @Override // org.apache.commons.codec.language.bm.Languages.LanguageSet
            public LanguageSet merge(LanguageSet languageSet) {
                return languageSet;
            }

            @Override // org.apache.commons.codec.language.bm.Languages.LanguageSet
            public LanguageSet restrictTo(LanguageSet languageSet) {
                return languageSet;
            }

            @Override // org.apache.commons.codec.language.bm.Languages.LanguageSet
            public String getAny() {
                throw new NoSuchElementException("Can't fetch any language from the any language set.");
            }

            public String toString() {
                return "ANY_LANGUAGE";
            }
        };
    }

    public static Languages getInstance(NameType nameType) {
        return LANGUAGES.get(nameType);
    }

    public static Languages getInstance(String str) {
        HashSet hashSet = new HashSet();
        Scanner scanner = new Scanner(Resources.getInputStream(str), "UTF-8");
        while (true) {
            boolean z = false;
            while (scanner.hasNextLine()) {
                try {
                    String strTrim = scanner.nextLine().trim();
                    if (z) {
                        if (strTrim.endsWith("*/")) {
                            break;
                        }
                    } else if (strTrim.startsWith("/*")) {
                        z = true;
                    } else if (strTrim.length() > 0) {
                        hashSet.add(strTrim);
                    }
                } finally {
                }
            }
            Languages languages = new Languages(Collections.unmodifiableSet(hashSet));
            scanner.close();
            return languages;
        }
    }

    public static String langResourceName(NameType nameType) {
        return String.format("org/apache/commons/codec/language/bm/%s_languages.txt", nameType.getName());
    }

    public Languages(Set<String> set) {
        this.languages = set;
    }

    public Set<String> getLanguages() {
        return this.languages;
    }
}
