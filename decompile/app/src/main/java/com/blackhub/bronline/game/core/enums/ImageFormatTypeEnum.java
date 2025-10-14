package com.blackhub.bronline.game.core.enums;

import com.blackhub.bronline.game.core.constants.FileFormats;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ImageFormatTypeEnum.kt */
@Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m7105d2 = {"Lcom/blackhub/bronline/game/core/enums/ImageFormatTypeEnum;", "", "dotType", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getDotType", "()Ljava/lang/String;", "PNG", "SVG", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class ImageFormatTypeEnum {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ ImageFormatTypeEnum[] $VALUES;
    public static final ImageFormatTypeEnum PNG = new ImageFormatTypeEnum("PNG", 0, ".png");
    public static final ImageFormatTypeEnum SVG = new ImageFormatTypeEnum("SVG", 1, FileFormats.SVG_FORMAT);

    @NotNull
    public final String dotType;

    public static final /* synthetic */ ImageFormatTypeEnum[] $values() {
        return new ImageFormatTypeEnum[]{PNG, SVG};
    }

    @NotNull
    public static EnumEntries<ImageFormatTypeEnum> getEntries() {
        return $ENTRIES;
    }

    public static ImageFormatTypeEnum valueOf(String str) {
        return (ImageFormatTypeEnum) Enum.valueOf(ImageFormatTypeEnum.class, str);
    }

    public static ImageFormatTypeEnum[] values() {
        return (ImageFormatTypeEnum[]) $VALUES.clone();
    }

    public ImageFormatTypeEnum(String str, int i, String str2) {
        this.dotType = str2;
    }

    @NotNull
    public final String getDotType() {
        return this.dotType;
    }

    static {
        ImageFormatTypeEnum[] imageFormatTypeEnumArr$values = $values();
        $VALUES = imageFormatTypeEnumArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(imageFormatTypeEnumArr$values);
    }
}
