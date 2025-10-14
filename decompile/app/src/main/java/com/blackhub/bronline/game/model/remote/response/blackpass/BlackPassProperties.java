package com.blackhub.bronline.game.model.remote.response.blackpass;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BlackPassProperties.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t¢\u0006\u0002\u0010\u0011J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J\t\u0010'\u001a\u00020\tHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001eJ\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J¢\u0001\u00100\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u00101J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u00020\tHÖ\u0001J\t\u00106\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0016\u0010\u000f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0016\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0016\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0013R\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b!\u0010\u001eR\u0016\u0010\u0010\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017¨\u00067"}, m7105d2 = {"Lcom/blackhub/bronline/game/model/remote/response/blackpass/BlackPassProperties;", "", "bgImage", "", "bpSeasonBg", "bpSeasonIcon", "leftImage", "rightImage", "seasonNumber", "", "seasonColor", "seasonDays", "seasonName", "levelPrice", "levelExp", "dailyTasksReward", "weaklyTasksReward", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;IIII)V", "getBgImage", "()Ljava/lang/String;", "getBpSeasonBg", "getBpSeasonIcon", "getDailyTasksReward", "()I", "getLeftImage", "getLevelExp", "getLevelPrice", "getRightImage", "getSeasonColor", "getSeasonDays", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSeasonName", "getSeasonNumber", "getWeaklyTasksReward", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;IIII)Lcom/blackhub/bronline/game/model/remote/response/blackpass/BlackPassProperties;", "equals", "", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final /* data */ class BlackPassProperties {
    public static final int $stable = 0;

    @SerializedName("bgImage")
    @Nullable
    public final String bgImage;

    @SerializedName("bg_season_bp")
    @Nullable
    public final String bpSeasonBg;

    @SerializedName("ic_season_bp")
    @Nullable
    public final String bpSeasonIcon;

    @SerializedName("dailyTasksReward")
    public final int dailyTasksReward;

    @SerializedName("leftImage")
    @Nullable
    public final String leftImage;

    @SerializedName("levelExp")
    public final int levelExp;

    @SerializedName("levelPrice")
    public final int levelPrice;

    @SerializedName("rightImage")
    @Nullable
    public final String rightImage;

    @SerializedName("season_color")
    @Nullable
    public final String seasonColor;

    @SerializedName("season_days")
    @Nullable
    public final Integer seasonDays;

    @SerializedName("season_name")
    @Nullable
    public final String seasonName;

    @SerializedName("seasonNumber")
    @Nullable
    public final Integer seasonNumber;

    @SerializedName("weaklyTasksReward")
    public final int weaklyTasksReward;

    public BlackPassProperties() {
        this(null, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 8191, null);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getBgImage() {
        return this.bgImage;
    }

    /* renamed from: component10, reason: from getter */
    public final int getLevelPrice() {
        return this.levelPrice;
    }

    /* renamed from: component11, reason: from getter */
    public final int getLevelExp() {
        return this.levelExp;
    }

    /* renamed from: component12, reason: from getter */
    public final int getDailyTasksReward() {
        return this.dailyTasksReward;
    }

    /* renamed from: component13, reason: from getter */
    public final int getWeaklyTasksReward() {
        return this.weaklyTasksReward;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getBpSeasonBg() {
        return this.bpSeasonBg;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getBpSeasonIcon() {
        return this.bpSeasonIcon;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getLeftImage() {
        return this.leftImage;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getRightImage() {
        return this.rightImage;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getSeasonNumber() {
        return this.seasonNumber;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getSeasonColor() {
        return this.seasonColor;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Integer getSeasonDays() {
        return this.seasonDays;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final String getSeasonName() {
        return this.seasonName;
    }

    @NotNull
    public final BlackPassProperties copy(@Nullable String bgImage, @Nullable String bpSeasonBg, @Nullable String bpSeasonIcon, @Nullable String leftImage, @Nullable String rightImage, @Nullable Integer seasonNumber, @Nullable String seasonColor, @Nullable Integer seasonDays, @Nullable String seasonName, int levelPrice, int levelExp, int dailyTasksReward, int weaklyTasksReward) {
        return new BlackPassProperties(bgImage, bpSeasonBg, bpSeasonIcon, leftImage, rightImage, seasonNumber, seasonColor, seasonDays, seasonName, levelPrice, levelExp, dailyTasksReward, weaklyTasksReward);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlackPassProperties)) {
            return false;
        }
        BlackPassProperties blackPassProperties = (BlackPassProperties) other;
        return Intrinsics.areEqual(this.bgImage, blackPassProperties.bgImage) && Intrinsics.areEqual(this.bpSeasonBg, blackPassProperties.bpSeasonBg) && Intrinsics.areEqual(this.bpSeasonIcon, blackPassProperties.bpSeasonIcon) && Intrinsics.areEqual(this.leftImage, blackPassProperties.leftImage) && Intrinsics.areEqual(this.rightImage, blackPassProperties.rightImage) && Intrinsics.areEqual(this.seasonNumber, blackPassProperties.seasonNumber) && Intrinsics.areEqual(this.seasonColor, blackPassProperties.seasonColor) && Intrinsics.areEqual(this.seasonDays, blackPassProperties.seasonDays) && Intrinsics.areEqual(this.seasonName, blackPassProperties.seasonName) && this.levelPrice == blackPassProperties.levelPrice && this.levelExp == blackPassProperties.levelExp && this.dailyTasksReward == blackPassProperties.dailyTasksReward && this.weaklyTasksReward == blackPassProperties.weaklyTasksReward;
    }

    public int hashCode() {
        String str = this.bgImage;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.bpSeasonBg;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.bpSeasonIcon;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.leftImage;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.rightImage;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.seasonNumber;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.seasonColor;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num2 = this.seasonDays;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str7 = this.seasonName;
        return ((((((((iHashCode8 + (str7 != null ? str7.hashCode() : 0)) * 31) + Integer.hashCode(this.levelPrice)) * 31) + Integer.hashCode(this.levelExp)) * 31) + Integer.hashCode(this.dailyTasksReward)) * 31) + Integer.hashCode(this.weaklyTasksReward);
    }

    @NotNull
    public String toString() {
        return "BlackPassProperties(bgImage=" + this.bgImage + ", bpSeasonBg=" + this.bpSeasonBg + ", bpSeasonIcon=" + this.bpSeasonIcon + ", leftImage=" + this.leftImage + ", rightImage=" + this.rightImage + ", seasonNumber=" + this.seasonNumber + ", seasonColor=" + this.seasonColor + ", seasonDays=" + this.seasonDays + ", seasonName=" + this.seasonName + ", levelPrice=" + this.levelPrice + ", levelExp=" + this.levelExp + ", dailyTasksReward=" + this.dailyTasksReward + ", weaklyTasksReward=" + this.weaklyTasksReward + ")";
    }

    public BlackPassProperties(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Integer num, @Nullable String str6, @Nullable Integer num2, @Nullable String str7, int i, int i2, int i3, int i4) {
        this.bgImage = str;
        this.bpSeasonBg = str2;
        this.bpSeasonIcon = str3;
        this.leftImage = str4;
        this.rightImage = str5;
        this.seasonNumber = num;
        this.seasonColor = str6;
        this.seasonDays = num2;
        this.seasonName = str7;
        this.levelPrice = i;
        this.levelExp = i2;
        this.dailyTasksReward = i3;
        this.weaklyTasksReward = i4;
    }

    public /* synthetic */ BlackPassProperties(String str, String str2, String str3, String str4, String str5, Integer num, String str6, Integer num2, String str7, int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i5 & 2) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str2, (i5 & 4) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str3, (i5 & 8) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str4, (i5 & 16) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str5, (i5 & 32) != 0 ? 0 : num, (i5 & 64) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str6, (i5 & 128) != 0 ? 0 : num2, (i5 & 256) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str7, (i5 & 512) != 0 ? 0 : i, (i5 & 1024) != 0 ? 0 : i2, (i5 & 2048) != 0 ? 0 : i3, (i5 & 4096) == 0 ? i4 : 0);
    }

    @Nullable
    public final String getBgImage() {
        return this.bgImage;
    }

    @Nullable
    public final String getBpSeasonBg() {
        return this.bpSeasonBg;
    }

    @Nullable
    public final String getBpSeasonIcon() {
        return this.bpSeasonIcon;
    }

    @Nullable
    public final String getLeftImage() {
        return this.leftImage;
    }

    @Nullable
    public final String getRightImage() {
        return this.rightImage;
    }

    @Nullable
    public final Integer getSeasonNumber() {
        return this.seasonNumber;
    }

    @Nullable
    public final String getSeasonColor() {
        return this.seasonColor;
    }

    @Nullable
    public final Integer getSeasonDays() {
        return this.seasonDays;
    }

    @Nullable
    public final String getSeasonName() {
        return this.seasonName;
    }

    public final int getLevelPrice() {
        return this.levelPrice;
    }

    public final int getLevelExp() {
        return this.levelExp;
    }

    public final int getDailyTasksReward() {
        return this.dailyTasksReward;
    }

    public final int getWeaklyTasksReward() {
        return this.weaklyTasksReward;
    }
}
