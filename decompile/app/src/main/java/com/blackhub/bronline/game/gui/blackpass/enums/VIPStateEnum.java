package com.blackhub.bronline.game.gui.blackpass.enums;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.ivy.ant.IvyCleanCache;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VIPStateEnum.kt */
@Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u001b\b\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/blackpass/enums/VIPStateEnum;", "", "type", "", "vipName", "", "(Ljava/lang/String;IILjava/lang/String;)V", "getType", "()I", "getVipName", "()Ljava/lang/String;", IvyCleanCache.NONE, "STANDARD", "PREMIUM", "PREMIUM_DELUXE", "Companion", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class VIPStateEnum {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ VIPStateEnum[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public final int type;

    @NotNull
    public final String vipName;
    public static final VIPStateEnum NONE = new VIPStateEnum(IvyCleanCache.NONE, 0, -1, IvyCleanCache.NONE);
    public static final VIPStateEnum STANDARD = new VIPStateEnum("STANDARD", 1, 0, "STANDARD");
    public static final VIPStateEnum PREMIUM = new VIPStateEnum("PREMIUM", 2, 2, "PREMIUM");
    public static final VIPStateEnum PREMIUM_DELUXE = new VIPStateEnum("PREMIUM_DELUXE", 3, 1, "PREMIUM DELUXE");

    public static final /* synthetic */ VIPStateEnum[] $values() {
        return new VIPStateEnum[]{NONE, STANDARD, PREMIUM, PREMIUM_DELUXE};
    }

    @NotNull
    public static EnumEntries<VIPStateEnum> getEntries() {
        return $ENTRIES;
    }

    public static VIPStateEnum valueOf(String str) {
        return (VIPStateEnum) Enum.valueOf(VIPStateEnum.class, str);
    }

    public static VIPStateEnum[] values() {
        return (VIPStateEnum[]) $VALUES.clone();
    }

    public VIPStateEnum(String str, int i, int i2, String str2) {
        this.type = i2;
        this.vipName = str2;
    }

    public /* synthetic */ VIPStateEnum(String str, int i, int i2, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i3 & 1) != 0 ? -1 : i2, (i3 & 2) != 0 ? IvyCleanCache.NONE : str2);
    }

    public final int getType() {
        return this.type;
    }

    @NotNull
    public final String getVipName() {
        return this.vipName;
    }

    static {
        VIPStateEnum[] vIPStateEnumArr$values = $values();
        $VALUES = vIPStateEnumArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(vIPStateEnumArr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: VIPStateEnum.kt */
    @Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\t"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/blackpass/enums/VIPStateEnum$Companion;", "", "()V", "fromInt", "Lcom/blackhub/bronline/game/gui/blackpass/enums/VIPStateEnum;", "value", "", "isWithVip", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nVIPStateEnum.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VIPStateEnum.kt\ncom/blackhub/bronline/game/gui/blackpass/enums/VIPStateEnum$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,18:1\n288#2,2:19\n*S KotlinDebug\n*F\n+ 1 VIPStateEnum.kt\ncom/blackhub/bronline/game/gui/blackpass/enums/VIPStateEnum$Companion\n*L\n11#1:19,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final VIPStateEnum fromInt(int value) {
            VIPStateEnum next;
            Iterator<VIPStateEnum> it = VIPStateEnum.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.getType() == value) {
                    break;
                }
            }
            VIPStateEnum vIPStateEnum = next;
            return vIPStateEnum == null ? VIPStateEnum.STANDARD : vIPStateEnum;
        }

        public final boolean isWithVip(int value) {
            return value != VIPStateEnum.STANDARD.getType();
        }
    }
}
