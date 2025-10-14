package com.blackhub.bronline.game.core.enums;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ImageTypePathInCDNEnum.kt */
/* loaded from: classes2.dex */
public final class ImageTypePathInCDNEnum {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ ImageTypePathInCDNEnum[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    public final String type;
    public static final ImageTypePathInCDNEnum VEHICLE = new ImageTypePathInCDNEnum("VEHICLE", 0, "vehicles/");
    public static final ImageTypePathInCDNEnum SKIN = new ImageTypePathInCDNEnum("SKIN", 1, "skins/");
    public static final ImageTypePathInCDNEnum ACCESSORY = new ImageTypePathInCDNEnum("ACCESSORY", 2, "accessories/");
    public static final ImageTypePathInCDNEnum COMPONENT = new ImageTypePathInCDNEnum("COMPONENT", 3, "components/");
    public static final ImageTypePathInCDNEnum BACKGROUND = new ImageTypePathInCDNEnum("BACKGROUND", 4, "backgrounds/");
    public static final ImageTypePathInCDNEnum ICON = new ImageTypePathInCDNEnum("ICON", 5, "icons/");
    public static final ImageTypePathInCDNEnum IMAGE = new ImageTypePathInCDNEnum("IMAGE", 6, "pictures/");

    public static final /* synthetic */ ImageTypePathInCDNEnum[] $values() {
        return new ImageTypePathInCDNEnum[]{VEHICLE, SKIN, ACCESSORY, COMPONENT, BACKGROUND, ICON, IMAGE};
    }

    @NotNull
    public static EnumEntries<ImageTypePathInCDNEnum> getEntries() {
        return $ENTRIES;
    }

    public static ImageTypePathInCDNEnum valueOf(String str) {
        return (ImageTypePathInCDNEnum) Enum.valueOf(ImageTypePathInCDNEnum.class, str);
    }

    public static ImageTypePathInCDNEnum[] values() {
        return (ImageTypePathInCDNEnum[]) $VALUES.clone();
    }

    public ImageTypePathInCDNEnum(String str, int i, String str2) {
        this.type = str2;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    static {
        ImageTypePathInCDNEnum[] imageTypePathInCDNEnumArr$values = $values();
        $VALUES = imageTypePathInCDNEnumArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(imageTypePathInCDNEnumArr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: ImageTypePathInCDNEnum.kt */
    @Metadata(m7104d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006¨\u0006\b"}, m7105d2 = {"Lcom/blackhub/bronline/game/core/enums/ImageTypePathInCDNEnum$Companion;", "", "()V", "getActualPathByAwardId", "Lcom/blackhub/bronline/game/core/enums/ImageTypePathInCDNEnum;", "awardId", "", "internalId", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public static /* synthetic */ ImageTypePathInCDNEnum getActualPathByAwardId$default(Companion companion, int i, int i2, int i3, Object obj) {
            if ((i3 & 2) != 0) {
                i2 = 0;
            }
            return companion.getActualPathByAwardId(i, i2);
        }

        @NotNull
        public final ImageTypePathInCDNEnum getActualPathByAwardId(int awardId, int internalId) {
            if (awardId == 5) {
                return ImageTypePathInCDNEnum.VEHICLE;
            }
            if (awardId != 11) {
                return ImageTypePathInCDNEnum.IMAGE;
            }
            if (internalId == 134) {
                return ImageTypePathInCDNEnum.SKIN;
            }
            return ImageTypePathInCDNEnum.ACCESSORY;
        }
    }
}

