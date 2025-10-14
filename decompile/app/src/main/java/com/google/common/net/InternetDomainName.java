package com.google.common.net;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Ascii;
import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.thirdparty.publicsuffix.PublicSuffixPatterns;
import com.google.thirdparty.publicsuffix.PublicSuffixType;
import io.ktor.util.date.GMTDateParser;
import java.util.List;
import javax.annotation.CheckForNull;

@Immutable
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes8.dex */
public final class InternetDomainName {
    public static final CharMatcher DASH_MATCHER;
    public static final CharMatcher DIGIT_MATCHER;
    public static final CharMatcher LETTER_MATCHER;
    public static final int MAX_DOMAIN_PART_LENGTH = 63;
    public static final int MAX_LENGTH = 253;
    public static final int MAX_PARTS = 127;
    public static final int NO_SUFFIX_FOUND = -1;
    public static final CharMatcher PART_CHAR_MATCHER;
    public static final int SUFFIX_NOT_INITIALIZED = -2;
    public final String name;
    public final ImmutableList<String> parts;

    @LazyInit
    public int publicSuffixIndexCache = -2;

    @LazyInit
    public int registrySuffixIndexCache = -2;
    public static final CharMatcher DOTS_MATCHER = CharMatcher.anyOf(".。．｡");
    public static final Splitter DOT_SPLITTER = Splitter.m1150on('.');
    public static final Joiner DOT_JOINER = Joiner.m1143on('.');

    static {
        CharMatcher charMatcherAnyOf = CharMatcher.anyOf("-_");
        DASH_MATCHER = charMatcherAnyOf;
        CharMatcher charMatcherInRange = CharMatcher.inRange('0', '9');
        DIGIT_MATCHER = charMatcherInRange;
        CharMatcher charMatcherMo1142or = CharMatcher.inRange('a', GMTDateParser.ZONE).mo1142or(CharMatcher.inRange('A', 'Z'));
        LETTER_MATCHER = charMatcherMo1142or;
        PART_CHAR_MATCHER = charMatcherInRange.mo1142or(charMatcherMo1142or).mo1142or(charMatcherAnyOf);
    }

    public InternetDomainName(String name) {
        String lowerCase = Ascii.toLowerCase(DOTS_MATCHER.replaceFrom((CharSequence) name, '.'));
        lowerCase = lowerCase.endsWith(".") ? lowerCase.substring(0, lowerCase.length() - 1) : lowerCase;
        Preconditions.checkArgument(lowerCase.length() <= 253, "Domain name too long: '%s':", lowerCase);
        this.name = lowerCase;
        ImmutableList<String> immutableListCopyOf = ImmutableList.copyOf(DOT_SPLITTER.split(lowerCase));
        this.parts = immutableListCopyOf;
        Preconditions.checkArgument(immutableListCopyOf.size() <= 127, "Domain has too many parts: '%s'", lowerCase);
        Preconditions.checkArgument(validateSyntax(immutableListCopyOf), "Not a valid domain name: '%s'", lowerCase);
    }

    public final int publicSuffixIndex() {
        int i = this.publicSuffixIndexCache;
        if (i != -2) {
            return i;
        }
        int iFindSuffixOfType = findSuffixOfType(Optional.absent());
        this.publicSuffixIndexCache = iFindSuffixOfType;
        return iFindSuffixOfType;
    }

    public final int registrySuffixIndex() {
        int i = this.registrySuffixIndexCache;
        if (i != -2) {
            return i;
        }
        int iFindSuffixOfType = findSuffixOfType(Optional.m1145of(PublicSuffixType.REGISTRY));
        this.registrySuffixIndexCache = iFindSuffixOfType;
        return iFindSuffixOfType;
    }

    public final int findSuffixOfType(Optional<PublicSuffixType> desiredType) {
        int size = this.parts.size();
        for (int i = 0; i < size; i++) {
            String strJoin = DOT_JOINER.join(this.parts.subList(i, size));
            if (i > 0 && matchesType(desiredType, Optional.fromNullable(PublicSuffixPatterns.UNDER.get(strJoin)))) {
                return i - 1;
            }
            if (matchesType(desiredType, Optional.fromNullable(PublicSuffixPatterns.EXACT.get(strJoin)))) {
                return i;
            }
            if (PublicSuffixPatterns.EXCLUDED.containsKey(strJoin)) {
                return i + 1;
            }
        }
        return -1;
    }

    @CanIgnoreReturnValue
    public static InternetDomainName from(String domain) {
        return new InternetDomainName((String) Preconditions.checkNotNull(domain));
    }

    public static boolean validateSyntax(List<String> parts) {
        int size = parts.size() - 1;
        if (!validatePart(parts.get(size), true)) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!validatePart(parts.get(i), false)) {
                return false;
            }
        }
        return true;
    }

    public static boolean validatePart(String part, boolean isFinalPart) {
        if (part.length() >= 1 && part.length() <= 63) {
            if (!PART_CHAR_MATCHER.matchesAllOf(CharMatcher.ascii().retainFrom(part))) {
                return false;
            }
            CharMatcher charMatcher = DASH_MATCHER;
            if (!charMatcher.matches(part.charAt(0)) && !charMatcher.matches(part.charAt(part.length() - 1))) {
                return (isFinalPart && DIGIT_MATCHER.matches(part.charAt(0))) ? false : true;
            }
        }
        return false;
    }

    public ImmutableList<String> parts() {
        return this.parts;
    }

    public boolean isPublicSuffix() {
        return publicSuffixIndex() == 0;
    }

    public boolean hasPublicSuffix() {
        return publicSuffixIndex() != -1;
    }

    @CheckForNull
    public InternetDomainName publicSuffix() {
        if (hasPublicSuffix()) {
            return ancestor(publicSuffixIndex());
        }
        return null;
    }

    public boolean isUnderPublicSuffix() {
        return publicSuffixIndex() > 0;
    }

    public boolean isTopPrivateDomain() {
        return publicSuffixIndex() == 1;
    }

    public InternetDomainName topPrivateDomain() {
        if (isTopPrivateDomain()) {
            return this;
        }
        Preconditions.checkState(isUnderPublicSuffix(), "Not under a public suffix: %s", this.name);
        return ancestor(publicSuffixIndex() - 1);
    }

    public boolean isRegistrySuffix() {
        return registrySuffixIndex() == 0;
    }

    public boolean hasRegistrySuffix() {
        return registrySuffixIndex() != -1;
    }

    @CheckForNull
    public InternetDomainName registrySuffix() {
        if (hasRegistrySuffix()) {
            return ancestor(registrySuffixIndex());
        }
        return null;
    }

    public boolean isUnderRegistrySuffix() {
        return registrySuffixIndex() > 0;
    }

    public boolean isTopDomainUnderRegistrySuffix() {
        return registrySuffixIndex() == 1;
    }

    public InternetDomainName topDomainUnderRegistrySuffix() {
        if (isTopDomainUnderRegistrySuffix()) {
            return this;
        }
        Preconditions.checkState(isUnderRegistrySuffix(), "Not under a registry suffix: %s", this.name);
        return ancestor(registrySuffixIndex() - 1);
    }

    public boolean hasParent() {
        return this.parts.size() > 1;
    }

    public InternetDomainName parent() {
        Preconditions.checkState(hasParent(), "Domain '%s' has no parent", this.name);
        return ancestor(1);
    }

    public final InternetDomainName ancestor(int levels) {
        Joiner joiner = DOT_JOINER;
        ImmutableList<String> immutableList = this.parts;
        return from(joiner.join(immutableList.subList(levels, immutableList.size())));
    }

    public InternetDomainName child(String leftParts) {
        return from(((String) Preconditions.checkNotNull(leftParts)) + "." + this.name);
    }

    public static boolean isValid(String name) {
        try {
            from(name);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public static boolean matchesType(Optional<PublicSuffixType> desiredType, Optional<PublicSuffixType> actualType) {
        return desiredType.isPresent() ? desiredType.equals(actualType) : actualType.isPresent();
    }

    public String toString() {
        return this.name;
    }

    public boolean equals(@CheckForNull Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof InternetDomainName) {
            return this.name.equals(((InternetDomainName) object).name);
        }
        return false;
    }

    public int hashCode() {
        return this.name.hashCode();
    }
}
