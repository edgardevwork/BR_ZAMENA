package kotlin.collections;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AbstractIterator.kt */
@Metadata(m7104d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m7105d2 = {"Lkotlin/collections/State;", "", "(Ljava/lang/String;I)V", "Ready", "NotReady", "Done", "Failed", "kotlin-stdlib"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public final class State {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ State[] $VALUES;
    public static final State Ready = new State("Ready", 0);
    public static final State NotReady = new State("NotReady", 1);
    public static final State Done = new State("Done", 2);
    public static final State Failed = new State("Failed", 3);

    public static final /* synthetic */ State[] $values() {
        return new State[]{Ready, NotReady, Done, Failed};
    }

    @NotNull
    public static EnumEntries<State> getEntries() {
        return $ENTRIES;
    }

    public static State valueOf(String str) {
        return (State) Enum.valueOf(State.class, str);
    }

    public static State[] values() {
        return (State[]) $VALUES.clone();
    }

    public State(String str, int i) {
    }

    static {
        State[] stateArr$values = $values();
        $VALUES = stateArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(stateArr$values);
    }
}
