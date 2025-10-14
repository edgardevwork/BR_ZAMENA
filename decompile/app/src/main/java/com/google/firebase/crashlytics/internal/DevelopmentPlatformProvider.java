package com.google.firebase.crashlytics.internal;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes7.dex */
public class DevelopmentPlatformProvider {
    private static final String FLUTTER_ASSET_FILE = "flutter_assets/NOTICES.Z";
    private static final String FLUTTER_PLATFORM = "Flutter";
    private static final String UNITY_PLATFORM = "Unity";
    private static final String UNITY_VERSION_FIELD = "com.google.firebase.crashlytics.unity_version";
    private final Context context;

    @Nullable
    private DevelopmentPlatform developmentPlatform = null;

    public DevelopmentPlatformProvider(Context context) {
        this.context = context;
    }

    @Nullable
    public String getDevelopmentPlatform() {
        return initDevelopmentPlatform().developmentPlatform;
    }

    @Nullable
    public String getDevelopmentPlatformVersion() {
        return initDevelopmentPlatform().developmentPlatformVersion;
    }

    public static boolean isUnity(Context context) {
        return CommonUtils.getResourcesIdentifier(context, UNITY_VERSION_FIELD, TypedValues.Custom.S_STRING) != 0;
    }

    public boolean assetFileExists(String str) throws IOException {
        if (this.context.getAssets() == null) {
            return false;
        }
        try {
            InputStream inputStreamOpen = this.context.getAssets().open(str);
            if (inputStreamOpen == null) {
                return true;
            }
            inputStreamOpen.close();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    private DevelopmentPlatform initDevelopmentPlatform() {
        if (this.developmentPlatform == null) {
            this.developmentPlatform = new DevelopmentPlatform();
        }
        return this.developmentPlatform;
    }

    public class DevelopmentPlatform {

        @Nullable
        private final String developmentPlatform;

        @Nullable
        private final String developmentPlatformVersion;

        public /* synthetic */ DevelopmentPlatform(DevelopmentPlatformProvider developmentPlatformProvider, C76361 c76361) {
            this();
        }

        private DevelopmentPlatform() throws Resources.NotFoundException {
            int resourcesIdentifier = CommonUtils.getResourcesIdentifier(DevelopmentPlatformProvider.this.context, DevelopmentPlatformProvider.UNITY_VERSION_FIELD, TypedValues.Custom.S_STRING);
            if (resourcesIdentifier == 0) {
                if (DevelopmentPlatformProvider.this.assetFileExists(DevelopmentPlatformProvider.FLUTTER_ASSET_FILE)) {
                    this.developmentPlatform = DevelopmentPlatformProvider.FLUTTER_PLATFORM;
                    this.developmentPlatformVersion = null;
                    Logger.getLogger().m1361v("Development platform is: Flutter");
                    return;
                } else {
                    this.developmentPlatform = null;
                    this.developmentPlatformVersion = null;
                    return;
                }
            }
            this.developmentPlatform = DevelopmentPlatformProvider.UNITY_PLATFORM;
            String string = DevelopmentPlatformProvider.this.context.getResources().getString(resourcesIdentifier);
            this.developmentPlatformVersion = string;
            Logger.getLogger().m1361v("Unity Editor version is: " + string);
        }
    }
}
