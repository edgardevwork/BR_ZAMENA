package com.blackhub.bronline.game.core.utils.attachment.task;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommonTaskState.kt */
@Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m7105d2 = {"Lcom/blackhub/bronline/game/core/utils/attachment/task/CommonTaskState;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "GET_STATE", "UNAVAILABLE_STATE", "STOP_STATE", "TRACK_STATE", "UNAVAILABLE_STATE_2", "COMPLETED_STATE", "Companion", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class CommonTaskState {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ CommonTaskState[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public final int value;
    public static final CommonTaskState GET_STATE = new CommonTaskState("GET_STATE", 0, 1);
    public static final CommonTaskState UNAVAILABLE_STATE = new CommonTaskState("UNAVAILABLE_STATE", 1, 2);
    public static final CommonTaskState STOP_STATE = new CommonTaskState("STOP_STATE", 2, 3);
    public static final CommonTaskState TRACK_STATE = new CommonTaskState("TRACK_STATE", 3, 4);
    public static final CommonTaskState UNAVAILABLE_STATE_2 = new CommonTaskState("UNAVAILABLE_STATE_2", 4, 5);
    public static final CommonTaskState COMPLETED_STATE = new CommonTaskState("COMPLETED_STATE", 5, 6);

    public static final /* synthetic */ CommonTaskState[] $values() {
        return new CommonTaskState[]{GET_STATE, UNAVAILABLE_STATE, STOP_STATE, TRACK_STATE, UNAVAILABLE_STATE_2, COMPLETED_STATE};
    }

    @NotNull
    public static EnumEntries<CommonTaskState> getEntries() {
        return $ENTRIES;
    }

    public static CommonTaskState valueOf(String str) {
        return (CommonTaskState) Enum.valueOf(CommonTaskState.class, str);
    }

    public static CommonTaskState[] values() {
        return (CommonTaskState[]) $VALUES.clone();
    }

    public CommonTaskState(String str, int i, int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        CommonTaskState[] commonTaskStateArr$values = $values();
        $VALUES = commonTaskStateArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(commonTaskStateArr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: CommonTaskState.kt */
    @Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m7105d2 = {"Lcom/blackhub/bronline/game/core/utils/attachment/task/CommonTaskState$Companion;", "", "()V", "fromInt", "Lcom/blackhub/bronline/game/core/utils/attachment/task/CommonTaskState;", "value", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nCommonTaskState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonTaskState.kt\ncom/blackhub/bronline/game/core/utils/attachment/task/CommonTaskState$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,15:1\n288#2,2:16\n*S KotlinDebug\n*F\n+ 1 CommonTaskState.kt\ncom/blackhub/bronline/game/core/utils/attachment/task/CommonTaskState$Companion\n*L\n13#1:16,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final CommonTaskState fromInt(int value) {
            CommonTaskState next;
            Iterator<CommonTaskState> it = CommonTaskState.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.getValue() == value) {
                    break;
                }
            }
            CommonTaskState commonTaskState = next;
            return commonTaskState == null ? CommonTaskState.TRACK_STATE : commonTaskState;
        }
    }
}
