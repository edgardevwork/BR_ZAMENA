package com.blackhub.bronline.game.model.remote.response.holidayevents;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HolidayEventsResponse.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003¢\u0006\u0002\u0010\u0013J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\u0003HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\u0003HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003HÆ\u0003J\u0089\u0001\u0010%\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003HÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015¨\u0006-"}, m7105d2 = {"Lcom/blackhub/bronline/game/model/remote/response/holidayevents/HolidayEventsResponse;", "", "properties", "", "Lcom/blackhub/bronline/game/model/remote/response/holidayevents/HolidayEventsProperties;", "settings", "Lcom/blackhub/bronline/game/model/remote/response/holidayevents/HolidayEventsSettings;", "eventLevels", "Lcom/blackhub/bronline/game/model/remote/response/holidayevents/HolidayEventsEventLevel;", "limitUpgrades", "Lcom/blackhub/bronline/game/model/remote/response/holidayevents/HolidayEventsLimitUpgrades;", "ratingRewards", "Lcom/blackhub/bronline/game/model/remote/response/holidayevents/HolidayEventsRatingRewards;", "tasks", "Lcom/blackhub/bronline/game/model/remote/response/holidayevents/HolidayEventsTasks;", "miniGames", "Lcom/blackhub/bronline/game/model/remote/response/holidayevents/HolidayEventsMiniGames;", "tutorial", "Lcom/blackhub/bronline/game/model/remote/response/holidayevents/HolidayEventsTutorial;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getEventLevels", "()Ljava/util/List;", "getLimitUpgrades", "getMiniGames", "getProperties", "getRatingRewards", "getSettings", "getTasks", "getTutorial", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final /* data */ class HolidayEventsResponse {
    public static final int $stable = 8;

    @SerializedName("EventLevel")
    @NotNull
    public final List<HolidayEventsEventLevel> eventLevels;

    @SerializedName("LimitUpgrades")
    @NotNull
    public final List<HolidayEventsLimitUpgrades> limitUpgrades;

    @SerializedName("MiniGames")
    @NotNull
    public final List<HolidayEventsMiniGames> miniGames;

    @SerializedName("Properties")
    @NotNull
    public final List<HolidayEventsProperties> properties;

    @SerializedName("RatingRewards")
    @NotNull
    public final List<HolidayEventsRatingRewards> ratingRewards;

    @SerializedName("Settings")
    @NotNull
    public final List<HolidayEventsSettings> settings;

    @SerializedName("Tasks")
    @NotNull
    public final List<HolidayEventsTasks> tasks;

    @SerializedName("Tutorial")
    @NotNull
    public final List<HolidayEventsTutorial> tutorial;

    public HolidayEventsResponse() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    @NotNull
    public final List<HolidayEventsProperties> component1() {
        return this.properties;
    }

    @NotNull
    public final List<HolidayEventsSettings> component2() {
        return this.settings;
    }

    @NotNull
    public final List<HolidayEventsEventLevel> component3() {
        return this.eventLevels;
    }

    @NotNull
    public final List<HolidayEventsLimitUpgrades> component4() {
        return this.limitUpgrades;
    }

    @NotNull
    public final List<HolidayEventsRatingRewards> component5() {
        return this.ratingRewards;
    }

    @NotNull
    public final List<HolidayEventsTasks> component6() {
        return this.tasks;
    }

    @NotNull
    public final List<HolidayEventsMiniGames> component7() {
        return this.miniGames;
    }

    @NotNull
    public final List<HolidayEventsTutorial> component8() {
        return this.tutorial;
    }

    @NotNull
    public final HolidayEventsResponse copy(@NotNull List<HolidayEventsProperties> properties, @NotNull List<HolidayEventsSettings> settings, @NotNull List<HolidayEventsEventLevel> eventLevels, @NotNull List<HolidayEventsLimitUpgrades> limitUpgrades, @NotNull List<HolidayEventsRatingRewards> ratingRewards, @NotNull List<HolidayEventsTasks> tasks, @NotNull List<HolidayEventsMiniGames> miniGames, @NotNull List<HolidayEventsTutorial> tutorial) {
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(eventLevels, "eventLevels");
        Intrinsics.checkNotNullParameter(limitUpgrades, "limitUpgrades");
        Intrinsics.checkNotNullParameter(ratingRewards, "ratingRewards");
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        Intrinsics.checkNotNullParameter(miniGames, "miniGames");
        Intrinsics.checkNotNullParameter(tutorial, "tutorial");
        return new HolidayEventsResponse(properties, settings, eventLevels, limitUpgrades, ratingRewards, tasks, miniGames, tutorial);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HolidayEventsResponse)) {
            return false;
        }
        HolidayEventsResponse holidayEventsResponse = (HolidayEventsResponse) other;
        return Intrinsics.areEqual(this.properties, holidayEventsResponse.properties) && Intrinsics.areEqual(this.settings, holidayEventsResponse.settings) && Intrinsics.areEqual(this.eventLevels, holidayEventsResponse.eventLevels) && Intrinsics.areEqual(this.limitUpgrades, holidayEventsResponse.limitUpgrades) && Intrinsics.areEqual(this.ratingRewards, holidayEventsResponse.ratingRewards) && Intrinsics.areEqual(this.tasks, holidayEventsResponse.tasks) && Intrinsics.areEqual(this.miniGames, holidayEventsResponse.miniGames) && Intrinsics.areEqual(this.tutorial, holidayEventsResponse.tutorial);
    }

    public int hashCode() {
        return (((((((((((((this.properties.hashCode() * 31) + this.settings.hashCode()) * 31) + this.eventLevels.hashCode()) * 31) + this.limitUpgrades.hashCode()) * 31) + this.ratingRewards.hashCode()) * 31) + this.tasks.hashCode()) * 31) + this.miniGames.hashCode()) * 31) + this.tutorial.hashCode();
    }

    @NotNull
    public String toString() {
        return "HolidayEventsResponse(properties=" + this.properties + ", settings=" + this.settings + ", eventLevels=" + this.eventLevels + ", limitUpgrades=" + this.limitUpgrades + ", ratingRewards=" + this.ratingRewards + ", tasks=" + this.tasks + ", miniGames=" + this.miniGames + ", tutorial=" + this.tutorial + ")";
    }

    public HolidayEventsResponse(@NotNull List<HolidayEventsProperties> properties, @NotNull List<HolidayEventsSettings> settings, @NotNull List<HolidayEventsEventLevel> eventLevels, @NotNull List<HolidayEventsLimitUpgrades> limitUpgrades, @NotNull List<HolidayEventsRatingRewards> ratingRewards, @NotNull List<HolidayEventsTasks> tasks, @NotNull List<HolidayEventsMiniGames> miniGames, @NotNull List<HolidayEventsTutorial> tutorial) {
        Intrinsics.checkNotNullParameter(properties, "properties");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(eventLevels, "eventLevels");
        Intrinsics.checkNotNullParameter(limitUpgrades, "limitUpgrades");
        Intrinsics.checkNotNullParameter(ratingRewards, "ratingRewards");
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        Intrinsics.checkNotNullParameter(miniGames, "miniGames");
        Intrinsics.checkNotNullParameter(tutorial, "tutorial");
        this.properties = properties;
        this.settings = settings;
        this.eventLevels = eventLevels;
        this.limitUpgrades = limitUpgrades;
        this.ratingRewards = ratingRewards;
        this.tasks = tasks;
        this.miniGames = miniGames;
        this.tutorial = tutorial;
    }

    public /* synthetic */ HolidayEventsResponse(List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list3, (i & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list4, (i & 16) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list5, (i & 32) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list6, (i & 64) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list7, (i & 128) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list8);
    }

    @NotNull
    public final List<HolidayEventsProperties> getProperties() {
        return this.properties;
    }

    @NotNull
    public final List<HolidayEventsSettings> getSettings() {
        return this.settings;
    }

    @NotNull
    public final List<HolidayEventsEventLevel> getEventLevels() {
        return this.eventLevels;
    }

    @NotNull
    public final List<HolidayEventsLimitUpgrades> getLimitUpgrades() {
        return this.limitUpgrades;
    }

    @NotNull
    public final List<HolidayEventsRatingRewards> getRatingRewards() {
        return this.ratingRewards;
    }

    @NotNull
    public final List<HolidayEventsTasks> getTasks() {
        return this.tasks;
    }

    @NotNull
    public final List<HolidayEventsMiniGames> getMiniGames() {
        return this.miniGames;
    }

    @NotNull
    public final List<HolidayEventsTutorial> getTutorial() {
        return this.tutorial;
    }
}
