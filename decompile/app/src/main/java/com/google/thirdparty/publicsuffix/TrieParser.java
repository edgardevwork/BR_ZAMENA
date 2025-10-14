package com.google.thirdparty.publicsuffix;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Queues;
import java.util.Deque;

@GwtCompatible
/* loaded from: classes8.dex */
public final class TrieParser {
    public static final Joiner DIRECT_JOINER = Joiner.m1144on("");

    public static ImmutableMap<String, PublicSuffixType> parseTrie(CharSequence... encodedChunks) {
        return parseFullString(DIRECT_JOINER.join(encodedChunks));
    }

    @VisibleForTesting
    public static ImmutableMap<String, PublicSuffixType> parseFullString(String encoded) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        int length = encoded.length();
        int iDoParseTrieToBuilder = 0;
        while (iDoParseTrieToBuilder < length) {
            iDoParseTrieToBuilder += doParseTrieToBuilder(Queues.newArrayDeque(), encoded, iDoParseTrieToBuilder, builder);
        }
        return builder.buildOrThrow();
    }

    public static int doParseTrieToBuilder(Deque<CharSequence> stack, CharSequence encoded, int start, ImmutableMap.Builder<String, PublicSuffixType> builder) {
        int length = encoded.length();
        char cCharAt = 0;
        int i = start;
        while (i < length && (cCharAt = encoded.charAt(i)) != '&' && cCharAt != '?' && cCharAt != '!' && cCharAt != ':' && cCharAt != ',') {
            i++;
        }
        stack.push(reverse(encoded.subSequence(start, i)));
        if (cCharAt == '!' || cCharAt == '?' || cCharAt == ':' || cCharAt == ',') {
            String strJoin = DIRECT_JOINER.join(stack);
            if (strJoin.length() > 0) {
                builder.put(strJoin, PublicSuffixType.fromCode(cCharAt));
            }
        }
        int iDoParseTrieToBuilder = i + 1;
        if (cCharAt != '?' && cCharAt != ',') {
            while (iDoParseTrieToBuilder < length) {
                iDoParseTrieToBuilder += doParseTrieToBuilder(stack, encoded, iDoParseTrieToBuilder, builder);
                if (encoded.charAt(iDoParseTrieToBuilder) == '?' || encoded.charAt(iDoParseTrieToBuilder) == ',') {
                    iDoParseTrieToBuilder++;
                    break;
                }
            }
        }
        stack.pop();
        return iDoParseTrieToBuilder - start;
    }

    public static CharSequence reverse(CharSequence s) {
        return new StringBuilder(s).reverse();
    }
}
