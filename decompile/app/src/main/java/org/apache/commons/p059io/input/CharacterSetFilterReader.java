package org.apache.commons.p059io.input;

import java.io.Reader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.function.IntPredicate;

/* loaded from: classes5.dex */
public class CharacterSetFilterReader extends AbstractCharacterFilterReader {
    public static IntPredicate toIntPredicate(Set<Integer> set) {
        if (set == null) {
            return AbstractCharacterFilterReader.SKIP_NONE;
        }
        final Set setUnmodifiableSet = Collections.unmodifiableSet(set);
        return new IntPredicate() { // from class: org.apache.commons.io.input.CharacterSetFilterReader$$ExternalSyntheticLambda0
            @Override // java.util.function.IntPredicate
            public final boolean test(int i) {
                return CharacterSetFilterReader.lambda$toIntPredicate$0(setUnmodifiableSet, i);
            }
        };
    }

    public static /* synthetic */ boolean lambda$toIntPredicate$0(Set set, int i) {
        return set.contains(Integer.valueOf(i));
    }

    public CharacterSetFilterReader(Reader reader, Integer... numArr) {
        this(reader, new HashSet(Arrays.asList(numArr)));
    }

    public CharacterSetFilterReader(Reader reader, Set<Integer> set) {
        super(reader, toIntPredicate(set));
    }
}
