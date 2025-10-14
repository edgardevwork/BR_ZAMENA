package androidx.core.content.p004pm;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.os.UserHandle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArraySet;
import androidx.core.app.Person;
import androidx.core.content.LocusIdCompat;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.net.UriCompat;
import androidx.core.util.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public class ShortcutInfoCompat {
    public static final String EXTRA_LOCUS_ID = "extraLocusId";
    public static final String EXTRA_LONG_LIVED = "extraLongLived";
    public static final String EXTRA_PERSON_ = "extraPerson_";
    public static final String EXTRA_PERSON_COUNT = "extraPersonCount";
    public static final String EXTRA_SLICE_URI = "extraSliceUri";
    public static final int SURFACE_LAUNCHER = 1;
    public ComponentName mActivity;
    public Set<String> mCategories;
    public Context mContext;
    public CharSequence mDisabledMessage;
    public int mDisabledReason;
    public int mExcludedSurfaces;
    public PersistableBundle mExtras;
    public boolean mHasKeyFieldsOnly;
    public IconCompat mIcon;
    public String mId;
    public Intent[] mIntents;
    public boolean mIsAlwaysBadged;
    public boolean mIsCached;
    public boolean mIsDeclaredInManifest;
    public boolean mIsDynamic;
    public boolean mIsEnabled = true;
    public boolean mIsImmutable;
    public boolean mIsLongLived;
    public boolean mIsPinned;
    public CharSequence mLabel;
    public long mLastChangedTimestamp;

    @Nullable
    public LocusIdCompat mLocusId;
    public CharSequence mLongLabel;
    public String mPackageName;
    public Person[] mPersons;
    public int mRank;
    public Bundle mTransientExtras;
    public UserHandle mUser;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface Surface {
    }

    @RequiresApi(25)
    public ShortcutInfo toShortcutInfo() {
        ShortcutInfoCompat$$ExternalSyntheticApiModelOutline17.m370m();
        ShortcutInfo.Builder intents = ShortcutInfoCompat$$ExternalSyntheticApiModelOutline16.m369m(this.mContext, this.mId).setShortLabel(this.mLabel).setIntents(this.mIntents);
        IconCompat iconCompat = this.mIcon;
        if (iconCompat != null) {
            intents.setIcon(iconCompat.toIcon(this.mContext));
        }
        if (!TextUtils.isEmpty(this.mLongLabel)) {
            intents.setLongLabel(this.mLongLabel);
        }
        if (!TextUtils.isEmpty(this.mDisabledMessage)) {
            intents.setDisabledMessage(this.mDisabledMessage);
        }
        ComponentName componentName = this.mActivity;
        if (componentName != null) {
            intents.setActivity(componentName);
        }
        Set<String> set = this.mCategories;
        if (set != null) {
            intents.setCategories(set);
        }
        intents.setRank(this.mRank);
        PersistableBundle persistableBundle = this.mExtras;
        if (persistableBundle != null) {
            intents.setExtras(persistableBundle);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            Person[] personArr = this.mPersons;
            if (personArr != null && personArr.length > 0) {
                int length = personArr.length;
                android.app.Person[] personArr2 = new android.app.Person[length];
                for (int i = 0; i < length; i++) {
                    personArr2[i] = this.mPersons[i].toAndroidPerson();
                }
                intents.setPersons(personArr2);
            }
            LocusIdCompat locusIdCompat = this.mLocusId;
            if (locusIdCompat != null) {
                intents.setLocusId(locusIdCompat.toLocusId());
            }
            intents.setLongLived(this.mIsLongLived);
        } else {
            intents.setExtras(buildLegacyExtrasBundle());
        }
        if (Build.VERSION.SDK_INT >= 33) {
            Api33Impl.setExcludedFromSurfaces(intents, this.mExcludedSurfaces);
        }
        return intents.build();
    }

    @RequiresApi(22)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final PersistableBundle buildLegacyExtrasBundle() {
        if (this.mExtras == null) {
            this.mExtras = new PersistableBundle();
        }
        Person[] personArr = this.mPersons;
        if (personArr != null && personArr.length > 0) {
            this.mExtras.putInt(EXTRA_PERSON_COUNT, personArr.length);
            int i = 0;
            while (i < this.mPersons.length) {
                PersistableBundle persistableBundle = this.mExtras;
                StringBuilder sb = new StringBuilder();
                sb.append(EXTRA_PERSON_);
                int i2 = i + 1;
                sb.append(i2);
                persistableBundle.putPersistableBundle(sb.toString(), this.mPersons[i].toPersistableBundle());
                i = i2;
            }
        }
        LocusIdCompat locusIdCompat = this.mLocusId;
        if (locusIdCompat != null) {
            this.mExtras.putString(EXTRA_LOCUS_ID, locusIdCompat.getId());
        }
        this.mExtras.putBoolean(EXTRA_LONG_LIVED, this.mIsLongLived);
        return this.mExtras;
    }

    public Intent addToIntent(Intent intent) throws PackageManager.NameNotFoundException {
        intent.putExtra("android.intent.extra.shortcut.INTENT", this.mIntents[r0.length - 1]).putExtra("android.intent.extra.shortcut.NAME", this.mLabel.toString());
        if (this.mIcon != null) {
            Drawable activityIcon = null;
            if (this.mIsAlwaysBadged) {
                PackageManager packageManager = this.mContext.getPackageManager();
                ComponentName componentName = this.mActivity;
                if (componentName != null) {
                    try {
                        activityIcon = packageManager.getActivityIcon(componentName);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                if (activityIcon == null) {
                    activityIcon = this.mContext.getApplicationInfo().loadIcon(packageManager);
                }
            }
            this.mIcon.addToShortcutIntent(intent, activityIcon, this.mContext);
        }
        return intent;
    }

    @NonNull
    public String getId() {
        return this.mId;
    }

    @NonNull
    public String getPackage() {
        return this.mPackageName;
    }

    @Nullable
    public ComponentName getActivity() {
        return this.mActivity;
    }

    @NonNull
    public CharSequence getShortLabel() {
        return this.mLabel;
    }

    @Nullable
    public CharSequence getLongLabel() {
        return this.mLongLabel;
    }

    @Nullable
    public CharSequence getDisabledMessage() {
        return this.mDisabledMessage;
    }

    public int getDisabledReason() {
        return this.mDisabledReason;
    }

    @NonNull
    public Intent getIntent() {
        return this.mIntents[r0.length - 1];
    }

    @NonNull
    public Intent[] getIntents() {
        Intent[] intentArr = this.mIntents;
        return (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
    }

    @Nullable
    public Set<String> getCategories() {
        return this.mCategories;
    }

    @Nullable
    public LocusIdCompat getLocusId() {
        return this.mLocusId;
    }

    public int getRank() {
        return this.mRank;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public IconCompat getIcon() {
        return this.mIcon;
    }

    @VisibleForTesting
    @Nullable
    @RequiresApi(25)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static Person[] getPersonsFromExtra(@NonNull PersistableBundle persistableBundle) {
        if (persistableBundle == null || !persistableBundle.containsKey(EXTRA_PERSON_COUNT)) {
            return null;
        }
        int i = persistableBundle.getInt(EXTRA_PERSON_COUNT);
        Person[] personArr = new Person[i];
        int i2 = 0;
        while (i2 < i) {
            StringBuilder sb = new StringBuilder();
            sb.append(EXTRA_PERSON_);
            int i3 = i2 + 1;
            sb.append(i3);
            personArr[i2] = Person.fromPersistableBundle(persistableBundle.getPersistableBundle(sb.toString()));
            i2 = i3;
        }
        return personArr;
    }

    @RequiresApi(25)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @VisibleForTesting
    public static boolean getLongLivedFromExtra(@Nullable PersistableBundle persistableBundle) {
        if (persistableBundle == null || !persistableBundle.containsKey(EXTRA_LONG_LIVED)) {
            return false;
        }
        return persistableBundle.getBoolean(EXTRA_LONG_LIVED);
    }

    @RequiresApi(25)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static List<ShortcutInfoCompat> fromShortcuts(@NonNull Context context, @NonNull List<ShortcutInfo> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<ShortcutInfo> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Builder(context, ShortcutInfoCompat$$ExternalSyntheticApiModelOutline13.m366m(it.next())).build());
        }
        return arrayList;
    }

    @Nullable
    public PersistableBundle getExtras() {
        return this.mExtras;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public Bundle getTransientExtras() {
        return this.mTransientExtras;
    }

    @Nullable
    public UserHandle getUserHandle() {
        return this.mUser;
    }

    public long getLastChangedTimestamp() {
        return this.mLastChangedTimestamp;
    }

    public boolean isCached() {
        return this.mIsCached;
    }

    public boolean isDynamic() {
        return this.mIsDynamic;
    }

    public boolean isPinned() {
        return this.mIsPinned;
    }

    public boolean isDeclaredInManifest() {
        return this.mIsDeclaredInManifest;
    }

    public boolean isImmutable() {
        return this.mIsImmutable;
    }

    public boolean isEnabled() {
        return this.mIsEnabled;
    }

    public boolean hasKeyFieldsOnly() {
        return this.mHasKeyFieldsOnly;
    }

    @Nullable
    @RequiresApi(25)
    public static LocusIdCompat getLocusId(@NonNull ShortcutInfo shortcutInfo) {
        if (Build.VERSION.SDK_INT >= 29) {
            if (shortcutInfo.getLocusId() == null) {
                return null;
            }
            return LocusIdCompat.toLocusIdCompat(shortcutInfo.getLocusId());
        }
        return getLocusIdFromExtra(shortcutInfo.getExtras());
    }

    public boolean isExcludedFromSurfaces(int i) {
        return (i & this.mExcludedSurfaces) != 0;
    }

    public int getExcludedFromSurfaces() {
        return this.mExcludedSurfaces;
    }

    @Nullable
    @RequiresApi(25)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static LocusIdCompat getLocusIdFromExtra(@Nullable PersistableBundle persistableBundle) {
        String string;
        if (persistableBundle == null || (string = persistableBundle.getString(EXTRA_LOCUS_ID)) == null) {
            return null;
        }
        return new LocusIdCompat(string);
    }

    public static class Builder {
        public Map<String, Map<String, List<String>>> mCapabilityBindingParams;
        public Set<String> mCapabilityBindings;
        public final ShortcutInfoCompat mInfo;
        public boolean mIsConversation;
        public Uri mSliceUri;

        public Builder(@NonNull Context context, @NonNull String str) {
            ShortcutInfoCompat shortcutInfoCompat = new ShortcutInfoCompat();
            this.mInfo = shortcutInfoCompat;
            shortcutInfoCompat.mContext = context;
            shortcutInfoCompat.mId = str;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public Builder(@NonNull ShortcutInfoCompat shortcutInfoCompat) {
            ShortcutInfoCompat shortcutInfoCompat2 = new ShortcutInfoCompat();
            this.mInfo = shortcutInfoCompat2;
            shortcutInfoCompat2.mContext = shortcutInfoCompat.mContext;
            shortcutInfoCompat2.mId = shortcutInfoCompat.mId;
            shortcutInfoCompat2.mPackageName = shortcutInfoCompat.mPackageName;
            Intent[] intentArr = shortcutInfoCompat.mIntents;
            shortcutInfoCompat2.mIntents = (Intent[]) Arrays.copyOf(intentArr, intentArr.length);
            shortcutInfoCompat2.mActivity = shortcutInfoCompat.mActivity;
            shortcutInfoCompat2.mLabel = shortcutInfoCompat.mLabel;
            shortcutInfoCompat2.mLongLabel = shortcutInfoCompat.mLongLabel;
            shortcutInfoCompat2.mDisabledMessage = shortcutInfoCompat.mDisabledMessage;
            shortcutInfoCompat2.mDisabledReason = shortcutInfoCompat.mDisabledReason;
            shortcutInfoCompat2.mIcon = shortcutInfoCompat.mIcon;
            shortcutInfoCompat2.mIsAlwaysBadged = shortcutInfoCompat.mIsAlwaysBadged;
            shortcutInfoCompat2.mUser = shortcutInfoCompat.mUser;
            shortcutInfoCompat2.mLastChangedTimestamp = shortcutInfoCompat.mLastChangedTimestamp;
            shortcutInfoCompat2.mIsCached = shortcutInfoCompat.mIsCached;
            shortcutInfoCompat2.mIsDynamic = shortcutInfoCompat.mIsDynamic;
            shortcutInfoCompat2.mIsPinned = shortcutInfoCompat.mIsPinned;
            shortcutInfoCompat2.mIsDeclaredInManifest = shortcutInfoCompat.mIsDeclaredInManifest;
            shortcutInfoCompat2.mIsImmutable = shortcutInfoCompat.mIsImmutable;
            shortcutInfoCompat2.mIsEnabled = shortcutInfoCompat.mIsEnabled;
            shortcutInfoCompat2.mLocusId = shortcutInfoCompat.mLocusId;
            shortcutInfoCompat2.mIsLongLived = shortcutInfoCompat.mIsLongLived;
            shortcutInfoCompat2.mHasKeyFieldsOnly = shortcutInfoCompat.mHasKeyFieldsOnly;
            shortcutInfoCompat2.mRank = shortcutInfoCompat.mRank;
            Person[] personArr = shortcutInfoCompat.mPersons;
            if (personArr != null) {
                shortcutInfoCompat2.mPersons = (Person[]) Arrays.copyOf(personArr, personArr.length);
            }
            if (shortcutInfoCompat.mCategories != null) {
                shortcutInfoCompat2.mCategories = new HashSet(shortcutInfoCompat.mCategories);
            }
            PersistableBundle persistableBundle = shortcutInfoCompat.mExtras;
            if (persistableBundle != null) {
                shortcutInfoCompat2.mExtras = persistableBundle;
            }
            shortcutInfoCompat2.mExcludedSurfaces = shortcutInfoCompat.mExcludedSurfaces;
        }

        @RequiresApi(25)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public Builder(@NonNull Context context, @NonNull ShortcutInfo shortcutInfo) {
            ShortcutInfoCompat shortcutInfoCompat = new ShortcutInfoCompat();
            this.mInfo = shortcutInfoCompat;
            shortcutInfoCompat.mContext = context;
            shortcutInfoCompat.mId = shortcutInfo.getId();
            shortcutInfoCompat.mPackageName = shortcutInfo.getPackage();
            Intent[] intents = shortcutInfo.getIntents();
            shortcutInfoCompat.mIntents = (Intent[]) Arrays.copyOf(intents, intents.length);
            shortcutInfoCompat.mActivity = shortcutInfo.getActivity();
            shortcutInfoCompat.mLabel = shortcutInfo.getShortLabel();
            shortcutInfoCompat.mLongLabel = shortcutInfo.getLongLabel();
            shortcutInfoCompat.mDisabledMessage = shortcutInfo.getDisabledMessage();
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                shortcutInfoCompat.mDisabledReason = shortcutInfo.getDisabledReason();
            } else {
                shortcutInfoCompat.mDisabledReason = shortcutInfo.isEnabled() ? 0 : 3;
            }
            shortcutInfoCompat.mCategories = shortcutInfo.getCategories();
            shortcutInfoCompat.mPersons = ShortcutInfoCompat.getPersonsFromExtra(shortcutInfo.getExtras());
            shortcutInfoCompat.mUser = shortcutInfo.getUserHandle();
            shortcutInfoCompat.mLastChangedTimestamp = shortcutInfo.getLastChangedTimestamp();
            if (i >= 30) {
                shortcutInfoCompat.mIsCached = shortcutInfo.isCached();
            }
            shortcutInfoCompat.mIsDynamic = shortcutInfo.isDynamic();
            shortcutInfoCompat.mIsPinned = shortcutInfo.isPinned();
            shortcutInfoCompat.mIsDeclaredInManifest = shortcutInfo.isDeclaredInManifest();
            shortcutInfoCompat.mIsImmutable = shortcutInfo.isImmutable();
            shortcutInfoCompat.mIsEnabled = shortcutInfo.isEnabled();
            shortcutInfoCompat.mHasKeyFieldsOnly = shortcutInfo.hasKeyFieldsOnly();
            shortcutInfoCompat.mLocusId = ShortcutInfoCompat.getLocusId(shortcutInfo);
            shortcutInfoCompat.mRank = shortcutInfo.getRank();
            shortcutInfoCompat.mExtras = shortcutInfo.getExtras();
        }

        @NonNull
        public Builder setShortLabel(@NonNull CharSequence charSequence) {
            this.mInfo.mLabel = charSequence;
            return this;
        }

        @NonNull
        public Builder setLongLabel(@NonNull CharSequence charSequence) {
            this.mInfo.mLongLabel = charSequence;
            return this;
        }

        @NonNull
        public Builder setDisabledMessage(@NonNull CharSequence charSequence) {
            this.mInfo.mDisabledMessage = charSequence;
            return this;
        }

        @NonNull
        public Builder setIntent(@NonNull Intent intent) {
            return setIntents(new Intent[]{intent});
        }

        @NonNull
        public Builder setIntents(@NonNull Intent[] intentArr) {
            this.mInfo.mIntents = intentArr;
            return this;
        }

        @NonNull
        public Builder setIcon(IconCompat iconCompat) {
            this.mInfo.mIcon = iconCompat;
            return this;
        }

        @NonNull
        public Builder setLocusId(@Nullable LocusIdCompat locusIdCompat) {
            this.mInfo.mLocusId = locusIdCompat;
            return this;
        }

        @NonNull
        public Builder setIsConversation() {
            this.mIsConversation = true;
            return this;
        }

        @NonNull
        public Builder setActivity(@NonNull ComponentName componentName) {
            this.mInfo.mActivity = componentName;
            return this;
        }

        @NonNull
        public Builder setAlwaysBadged() {
            this.mInfo.mIsAlwaysBadged = true;
            return this;
        }

        @NonNull
        public Builder setPerson(@NonNull Person person) {
            return setPersons(new Person[]{person});
        }

        @NonNull
        public Builder setPersons(@NonNull Person[] personArr) {
            this.mInfo.mPersons = personArr;
            return this;
        }

        @NonNull
        public Builder setCategories(@NonNull Set<String> set) {
            ArraySet arraySet = new ArraySet();
            arraySet.addAll(set);
            this.mInfo.mCategories = arraySet;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setLongLived() {
            this.mInfo.mIsLongLived = true;
            return this;
        }

        @NonNull
        public Builder setLongLived(boolean z) {
            this.mInfo.mIsLongLived = z;
            return this;
        }

        @NonNull
        public Builder setExcludedFromSurfaces(int i) {
            this.mInfo.mExcludedSurfaces = i;
            return this;
        }

        @NonNull
        public Builder setRank(int i) {
            this.mInfo.mRank = i;
            return this;
        }

        @NonNull
        public Builder setExtras(@NonNull PersistableBundle persistableBundle) {
            this.mInfo.mExtras = persistableBundle;
            return this;
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public Builder setTransientExtras(@NonNull Bundle bundle) {
            this.mInfo.mTransientExtras = (Bundle) Preconditions.checkNotNull(bundle);
            return this;
        }

        @NonNull
        @SuppressLint({"MissingGetterMatchingBuilder"})
        public Builder addCapabilityBinding(@NonNull String str) {
            if (this.mCapabilityBindings == null) {
                this.mCapabilityBindings = new HashSet();
            }
            this.mCapabilityBindings.add(str);
            return this;
        }

        @NonNull
        @SuppressLint({"MissingGetterMatchingBuilder"})
        public Builder addCapabilityBinding(@NonNull String str, @NonNull String str2, @NonNull List<String> list) {
            addCapabilityBinding(str);
            if (!list.isEmpty()) {
                if (this.mCapabilityBindingParams == null) {
                    this.mCapabilityBindingParams = new HashMap();
                }
                if (this.mCapabilityBindingParams.get(str) == null) {
                    this.mCapabilityBindingParams.put(str, new HashMap());
                }
                this.mCapabilityBindingParams.get(str).put(str2, list);
            }
            return this;
        }

        @NonNull
        @SuppressLint({"MissingGetterMatchingBuilder"})
        public Builder setSliceUri(@NonNull Uri uri) {
            this.mSliceUri = uri;
            return this;
        }

        @NonNull
        public ShortcutInfoCompat build() {
            if (TextUtils.isEmpty(this.mInfo.mLabel)) {
                throw new IllegalArgumentException("Shortcut must have a non-empty label");
            }
            ShortcutInfoCompat shortcutInfoCompat = this.mInfo;
            Intent[] intentArr = shortcutInfoCompat.mIntents;
            if (intentArr == null || intentArr.length == 0) {
                throw new IllegalArgumentException("Shortcut must have an intent");
            }
            if (this.mIsConversation) {
                if (shortcutInfoCompat.mLocusId == null) {
                    shortcutInfoCompat.mLocusId = new LocusIdCompat(shortcutInfoCompat.mId);
                }
                this.mInfo.mIsLongLived = true;
            }
            if (this.mCapabilityBindings != null) {
                ShortcutInfoCompat shortcutInfoCompat2 = this.mInfo;
                if (shortcutInfoCompat2.mCategories == null) {
                    shortcutInfoCompat2.mCategories = new HashSet();
                }
                this.mInfo.mCategories.addAll(this.mCapabilityBindings);
            }
            if (this.mCapabilityBindingParams != null) {
                ShortcutInfoCompat shortcutInfoCompat3 = this.mInfo;
                if (shortcutInfoCompat3.mExtras == null) {
                    shortcutInfoCompat3.mExtras = new PersistableBundle();
                }
                for (String str : this.mCapabilityBindingParams.keySet()) {
                    Map<String, List<String>> map = this.mCapabilityBindingParams.get(str);
                    this.mInfo.mExtras.putStringArray(str, (String[]) map.keySet().toArray(new String[0]));
                    for (String str2 : map.keySet()) {
                        List<String> list = map.get(str2);
                        this.mInfo.mExtras.putStringArray(str + "/" + str2, list == null ? new String[0] : (String[]) list.toArray(new String[0]));
                    }
                }
            }
            if (this.mSliceUri != null) {
                ShortcutInfoCompat shortcutInfoCompat4 = this.mInfo;
                if (shortcutInfoCompat4.mExtras == null) {
                    shortcutInfoCompat4.mExtras = new PersistableBundle();
                }
                this.mInfo.mExtras.putString(ShortcutInfoCompat.EXTRA_SLICE_URI, UriCompat.toSafeString(this.mSliceUri));
            }
            return this.mInfo;
        }
    }

    @RequiresApi(33)
    public static class Api33Impl {
        public static void setExcludedFromSurfaces(@NonNull ShortcutInfo.Builder builder, int i) {
            builder.setExcludedFromSurfaces(i);
        }
    }
}
