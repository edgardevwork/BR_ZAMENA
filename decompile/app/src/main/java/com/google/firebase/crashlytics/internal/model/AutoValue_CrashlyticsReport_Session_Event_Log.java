package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import androidx.media3.extractor.text.webvtt.WebvttCssParser;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* loaded from: classes8.dex */
final class AutoValue_CrashlyticsReport_Session_Event_Log extends CrashlyticsReport.Session.Event.Log {
    private final String content;

    private AutoValue_CrashlyticsReport_Session_Event_Log(String str) {
        this.content = str;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log
    @NonNull
    public String getContent() {
        return this.content;
    }

    public String toString() {
        return "Log{content=" + this.content + WebvttCssParser.RULE_END;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Event.Log) {
            return this.content.equals(((CrashlyticsReport.Session.Event.Log) obj).getContent());
        }
        return false;
    }

    public int hashCode() {
        return this.content.hashCode() ^ 1000003;
    }

    public static final class Builder extends CrashlyticsReport.Session.Event.Log.Builder {
        private String content;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log.Builder
        public CrashlyticsReport.Session.Event.Log.Builder setContent(String str) {
            if (str == null) {
                throw new NullPointerException("Null content");
            }
            this.content = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Log.Builder
        public CrashlyticsReport.Session.Event.Log build() {
            String str = this.content;
            if (str == null) {
                throw new IllegalStateException("Missing required properties: content");
            }
            return new AutoValue_CrashlyticsReport_Session_Event_Log(str);
        }
    }
}
