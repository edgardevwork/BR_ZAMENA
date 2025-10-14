package com.blackhub.bronline.game.core.enums;

import androidx.annotation.StringRes;
import com.bless.client.R;
import com.google.android.gms.stats.CodePackage;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: CommonRarityEnum.kt */
/* loaded from: classes2.dex */
public final class CommonRarityEnum extends Enum<CommonRarityEnum> {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ CommonRarityEnum[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public final int value;
    public static final CommonRarityEnum SPRAYED = new CommonRarityEnum("SPRAYED", 0, 0);
    public static final CommonRarityEnum COMMON = new CommonRarityEnum(CodePackage.COMMON, 1, 1);
    public static final CommonRarityEnum UNCOMMON = new CommonRarityEnum("UNCOMMON", 2, 2);
    public static final CommonRarityEnum RARE = new CommonRarityEnum("RARE", 3, 3);
    public static final CommonRarityEnum EPIC = new CommonRarityEnum("EPIC", 4, 4);
    public static final CommonRarityEnum LEGENDARY = new CommonRarityEnum("LEGENDARY", 5, 5);
    public static final CommonRarityEnum PRIZE = new CommonRarityEnum("PRIZE", 6, 6);

    public static final /* synthetic */ CommonRarityEnum[] $values() {
        return new CommonRarityEnum[]{SPRAYED, COMMON, UNCOMMON, RARE, EPIC, LEGENDARY, PRIZE};
    }

    @NotNull
    public static EnumEntries<CommonRarityEnum> getEntries() {
        return $ENTRIES;
    }

    public static CommonRarityEnum valueOf(String str) {
        return (CommonRarityEnum) Enum.valueOf(CommonRarityEnum.class, str);
    }

    public static CommonRarityEnum[] values() {
        return (CommonRarityEnum[]) $VALUES.clone();
    }

    public CommonRarityEnum(String str, int i, int i2) {
        super(str, i);
        this.value = i2;
    }

    public /* synthetic */ CommonRarityEnum(String str, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i3 & 1) != 0 ? 1 : i2);
    }

    public final int getValue() {
        return this.value;
    }

    static {
        CommonRarityEnum[] commonRarityEnumArr$values = $values();
        $VALUES = commonRarityEnumArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(commonRarityEnumArr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: CommonRarityEnum.kt */
    @Metadata(m7104d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0007¨\u0006\t"}, m7105d2 = {"Lcom/blackhub/bronline/game/core/enums/CommonRarityEnum$Companion;", "", "()V", "fromInt", "Lcom/blackhub/bronline/game/core/enums/CommonRarityEnum;", "value", "", "getRarityName", "rarity", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nCommonRarityEnum.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonRarityEnum.kt\ncom/blackhub/bronline/game/core/enums/CommonRarityEnum$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,29:1\n288#2,2:30\n*S KotlinDebug\n*F\n+ 1 CommonRarityEnum.kt\ncom/blackhub/bronline/game/core/enums/CommonRarityEnum$Companion\n*L\n15#1:30,2\n*E\n"})
    public static final class Companion {

        /* compiled from: CommonRarityEnum.kt */
        @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CommonRarityEnum.values().length];
                try {
                    iArr[CommonRarityEnum.LEGENDARY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CommonRarityEnum.EPIC.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CommonRarityEnum.RARE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[CommonRarityEnum.UNCOMMON.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[CommonRarityEnum.COMMON.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final CommonRarityEnum fromInt(int value) {
            CommonRarityEnum next;
            Iterator<CommonRarityEnum> it = CommonRarityEnum.getEntries().iterator();
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
            CommonRarityEnum commonRarityEnum = next;
            return commonRarityEnum == null ? CommonRarityEnum.COMMON : commonRarityEnum;
        }

        @StringRes
        public final int getRarityName(@NotNull CommonRarityEnum rarity) {
            Intrinsics.checkNotNullParameter(rarity, "rarity");
            int i = WhenMappings.$EnumSwitchMapping$0[rarity.ordinal()];
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? R.string.common_empty : R.string.craft_element_rarity_common : R.string.craft_element_rarity_uncommon : R.string.craft_element_rarity_rare : R.string.craft_element_rarity_epic : R.string.craft_element_rarity_legendary;
        }
    }
}

