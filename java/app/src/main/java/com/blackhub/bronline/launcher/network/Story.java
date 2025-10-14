package com.blackhub.bronline.launcher.network;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Story.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final /* data */ class Story {
    public static final int $stable = 8;

    @SerializedName("image")
    @NotNull
    public String image;

    @SerializedName("link")
    @NotNull
    public String link;

    @SerializedName("text")
    @NotNull
    public String text;

    @SerializedName("title")
    @NotNull
    public String title;

    public static /* synthetic */ Story copy$default(Story story, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = story.title;
        }
        if ((i & 2) != 0) {
            str2 = story.text;
        }
        if ((i & 4) != 0) {
            str3 = story.image;
        }
        if ((i & 8) != 0) {
            str4 = story.link;
        }
        return story.copy(str, str2, str3, str4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    @NotNull
    public final Story copy(@NotNull String title, @NotNull String text, @NotNull String image, @NotNull String link) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(link, "link");
        return new Story(title, text, image, link);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Story)) {
            return false;
        }
        Story story = (Story) other;
        return Intrinsics.areEqual(this.title, story.title) && Intrinsics.areEqual(this.text, story.text) && Intrinsics.areEqual(this.image, story.image) && Intrinsics.areEqual(this.link, story.link);
    }

    public int hashCode() {
        return (((((this.title.hashCode() * 31) + this.text.hashCode()) * 31) + this.image.hashCode()) * 31) + this.link.hashCode();
    }

    @NotNull
    public String toString() {
        return "Story(title=" + this.title + ", text=" + this.text + ", image=" + this.image + ", link=" + this.link + ")";
    }

    public Story(@NotNull String title, @NotNull String text, @NotNull String image, @NotNull String link) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(link, "link");
        this.title = title;
        this.text = text;
        this.image = image;
        this.link = link;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public final void setText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.text = str;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    public final void setImage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.image = str;
    }

    @NotNull
    public final String getLink() {
        return this.link;
    }

    public final void setLink(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.link = str;
    }
}

