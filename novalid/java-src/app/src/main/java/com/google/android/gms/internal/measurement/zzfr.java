package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzgd;
import com.google.android.gms.internal.measurement.zzjt;
import java.util.Collections;
import java.util.List;
import org.apache.commons.lang3.ObjectUtils;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes4.dex */
public final class zzfr {

    /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
    /* loaded from: classes7.dex */
    public static final class zza extends zzjt<zza, zzb> implements zzle {
        private static final zza zzc;
        private static volatile zzll<zza> zzd;
        private int zze;
        private boolean zzi;
        private zzkc<C11897zza> zzf = zzjt.zzch();
        private zzkc<zzc> zzg = zzjt.zzch();
        private zzkc<zzf> zzh = zzjt.zzch();
        private zzkc<C11897zza> zzj = zzjt.zzch();

        /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
        public static final class zzb extends zzjt.zzb<zza, zzb> implements zzle {
            private zzb() {
                super(zza.zzc);
            }
        }

        public static zza zzb() {
            return zzc;
        }

        /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
        /* renamed from: com.google.android.gms.internal.measurement.zzfr$zza$zza, reason: collision with other inner class name */
        public static final class C11897zza extends zzjt<C11897zza, C11898zza> implements zzle {
            private static final C11897zza zzc;
            private static volatile zzll<C11897zza> zzd;
            private int zze;
            private int zzf;
            private int zzg;

            /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
            /* renamed from: com.google.android.gms.internal.measurement.zzfr$zza$zza$zza, reason: collision with other inner class name */
            public static final class C11898zza extends zzjt.zzb<C11897zza, C11898zza> implements zzle {
                private C11898zza() {
                    super(C11897zza.zzc);
                }
            }

            public final zzd zzb() {
                zzd zzdVarZza = zzd.zza(this.zzg);
                return zzdVarZza == null ? zzd.CONSENT_STATUS_UNSPECIFIED : zzdVarZza;
            }

            public final zze zzc() {
                zze zzeVarZza = zze.zza(this.zzf);
                return zzeVarZza == null ? zze.CONSENT_TYPE_UNSPECIFIED : zzeVarZza;
            }

            @Override // com.google.android.gms.internal.measurement.zzjt
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzft.zza[i - 1]) {
                    case 1:
                        return new C11897zza();
                    case 2:
                        return new C11898zza();
                    case 3:
                        return zzjt.zza(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", zze.zzb(), "zzg", zzd.zzb()});
                    case 4:
                        return zzc;
                    case 5:
                        zzll<C11897zza> zzaVar = zzd;
                        if (zzaVar == null) {
                            synchronized (C11897zza.class) {
                                try {
                                    zzaVar = zzd;
                                    if (zzaVar == null) {
                                        zzaVar = new zzjt.zza<>(zzc);
                                        zzd = zzaVar;
                                    }
                                } finally {
                                }
                            }
                        }
                        return zzaVar;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                C11897zza c11897zza = new C11897zza();
                zzc = c11897zza;
                zzjt.zza((Class<C11897zza>) C11897zza.class, c11897zza);
            }

            private C11897zza() {
            }
        }

        /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
        public static final class zzc extends zzjt<zzc, C11899zza> implements zzle {
            private static final zzc zzc;
            private static volatile zzll<zzc> zzd;
            private int zze;
            private int zzf;
            private int zzg;

            /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
            /* renamed from: com.google.android.gms.internal.measurement.zzfr$zza$zzc$zza, reason: collision with other inner class name */
            public static final class C11899zza extends zzjt.zzb<zzc, C11899zza> implements zzle {
                private C11899zza() {
                    super(zzc.zzc);
                }
            }

            public final zze zzb() {
                zze zzeVarZza = zze.zza(this.zzg);
                return zzeVarZza == null ? zze.CONSENT_TYPE_UNSPECIFIED : zzeVarZza;
            }

            public final zze zzc() {
                zze zzeVarZza = zze.zza(this.zzf);
                return zzeVarZza == null ? zze.CONSENT_TYPE_UNSPECIFIED : zzeVarZza;
            }

            @Override // com.google.android.gms.internal.measurement.zzjt
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzft.zza[i - 1]) {
                    case 1:
                        return new zzc();
                    case 2:
                        return new C11899zza();
                    case 3:
                        return zzjt.zza(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", zze.zzb(), "zzg", zze.zzb()});
                    case 4:
                        return zzc;
                    case 5:
                        zzll<zzc> zzaVar = zzd;
                        if (zzaVar == null) {
                            synchronized (zzc.class) {
                                try {
                                    zzaVar = zzd;
                                    if (zzaVar == null) {
                                        zzaVar = new zzjt.zza<>(zzc);
                                        zzd = zzaVar;
                                    }
                                } finally {
                                }
                            }
                        }
                        return zzaVar;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                zzc zzcVar = new zzc();
                zzc = zzcVar;
                zzjt.zza((Class<zzc>) zzc.class, zzcVar);
            }

            private zzc() {
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjt
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzft.zza[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new zzb();
                case 3:
                    return zzjt.zza(zzc, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zze", "zzf", C11897zza.class, "zzg", zzc.class, "zzh", zzf.class, "zzi", "zzj", C11897zza.class});
                case 4:
                    return zzc;
                case 5:
                    zzll<zza> zzaVar = zzd;
                    if (zzaVar == null) {
                        synchronized (zza.class) {
                            try {
                                zzaVar = zzd;
                                if (zzaVar == null) {
                                    zzaVar = new zzjt.zza<>(zzc);
                                    zzd = zzaVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzaVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
        public enum zzd implements zzjy {
            CONSENT_STATUS_UNSPECIFIED(0),
            GRANTED(1),
            DENIED(2);

            private final int zze;

            @Override // com.google.android.gms.internal.measurement.zzjy
            public final int zza() {
                return this.zze;
            }

            public static zzd zza(int i) {
                if (i == 0) {
                    return CONSENT_STATUS_UNSPECIFIED;
                }
                if (i == 1) {
                    return GRANTED;
                }
                if (i != 2) {
                    return null;
                }
                return DENIED;
            }

            public static zzjx zzb() {
                return zzfu.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zzd.class.getName() + ObjectUtils.AT_SIGN + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zze + " name=" + name() + '>';
            }

            zzd(int i) {
                this.zze = i;
            }
        }

        /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
        public enum zze implements zzjy {
            CONSENT_TYPE_UNSPECIFIED(0),
            AD_STORAGE(1),
            ANALYTICS_STORAGE(2),
            AD_USER_DATA(3),
            AD_PERSONALIZATION(4);

            private final int zzg;

            @Override // com.google.android.gms.internal.measurement.zzjy
            public final int zza() {
                return this.zzg;
            }

            public static zze zza(int i) {
                if (i == 0) {
                    return CONSENT_TYPE_UNSPECIFIED;
                }
                if (i == 1) {
                    return AD_STORAGE;
                }
                if (i == 2) {
                    return ANALYTICS_STORAGE;
                }
                if (i == 3) {
                    return AD_USER_DATA;
                }
                if (i != 4) {
                    return null;
                }
                return AD_PERSONALIZATION;
            }

            public static zzjx zzb() {
                return zzfv.zza;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zze.class.getName() + ObjectUtils.AT_SIGN + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzg + " name=" + name() + '>';
            }

            zze(int i) {
                this.zzg = i;
            }
        }

        /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
        public static final class zzf extends zzjt<zzf, C11900zza> implements zzle {
            private static final zzf zzc;
            private static volatile zzll<zzf> zzd;
            private int zze;
            private String zzf = "";
            private String zzg = "";

            /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
            /* renamed from: com.google.android.gms.internal.measurement.zzfr$zza$zzf$zza, reason: collision with other inner class name */
            public static final class C11900zza extends zzjt.zzb<zzf, C11900zza> implements zzle {
                private C11900zza() {
                    super(zzf.zzc);
                }
            }

            @Override // com.google.android.gms.internal.measurement.zzjt
            public final Object zza(int i, Object obj, Object obj2) {
                switch (zzft.zza[i - 1]) {
                    case 1:
                        return new zzf();
                    case 2:
                        return new C11900zza();
                    case 3:
                        return zzjt.zza(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
                    case 4:
                        return zzc;
                    case 5:
                        zzll<zzf> zzaVar = zzd;
                        if (zzaVar == null) {
                            synchronized (zzf.class) {
                                try {
                                    zzaVar = zzd;
                                    if (zzaVar == null) {
                                        zzaVar = new zzjt.zza<>(zzc);
                                        zzd = zzaVar;
                                    }
                                } finally {
                                }
                            }
                        }
                        return zzaVar;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            public final String zzb() {
                return this.zzf;
            }

            static {
                zzf zzfVar = new zzf();
                zzc = zzfVar;
                zzjt.zza((Class<zzf>) zzf.class, zzfVar);
            }

            private zzf() {
            }
        }

        public final List<zzf> zzc() {
            return this.zzh;
        }

        public final List<C11897zza> zzd() {
            return this.zzf;
        }

        public final List<zzc> zze() {
            return this.zzg;
        }

        public final List<C11897zza> zzf() {
            return this.zzj;
        }

        static {
            zza zzaVar = new zza();
            zzc = zzaVar;
            zzjt.zza((Class<zza>) zza.class, zzaVar);
        }

        private zza() {
        }

        public final boolean zzg() {
            return this.zzi;
        }

        public final boolean zzh() {
            return (this.zze & 1) != 0;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
    /* loaded from: classes7.dex */
    public static final class zzc extends zzjt<zzc, zza> implements zzle {
        private static final zzc zzc;
        private static volatile zzll<zzc> zzd;
        private int zze;
        private String zzf = "";
        private boolean zzg;
        private boolean zzh;
        private int zzi;

        /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
        public static final class zza extends zzjt.zzb<zzc, zza> implements zzle {
            public final int zza() {
                return ((zzc) this.zza).zza();
            }

            public final zza zza(String str) {
                zzak();
                zzc.zza((zzc) this.zza, str);
                return this;
            }

            public final String zzb() {
                return ((zzc) this.zza).zzc();
            }

            private zza() {
                super(zzc.zzc);
            }

            public final boolean zzc() {
                return ((zzc) this.zza).zzd();
            }

            public final boolean zzd() {
                return ((zzc) this.zza).zze();
            }

            public final boolean zze() {
                return ((zzc) this.zza).zzf();
            }

            public final boolean zzf() {
                return ((zzc) this.zza).zzg();
            }

            public final boolean zzg() {
                return ((zzc) this.zza).zzh();
            }
        }

        public final int zza() {
            return this.zzi;
        }

        @Override // com.google.android.gms.internal.measurement.zzjt
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzft.zza[i - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza();
                case 3:
                    return zzjt.zza(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
                case 4:
                    return zzc;
                case 5:
                    zzll<zzc> zzaVar = zzd;
                    if (zzaVar == null) {
                        synchronized (zzc.class) {
                            try {
                                zzaVar = zzd;
                                if (zzaVar == null) {
                                    zzaVar = new zzjt.zza<>(zzc);
                                    zzd = zzaVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzaVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final String zzc() {
            return this.zzf;
        }

        public static /* synthetic */ void zza(zzc zzcVar, String str) {
            str.getClass();
            zzcVar.zze |= 1;
            zzcVar.zzf = str;
        }

        static {
            zzc zzcVar = new zzc();
            zzc = zzcVar;
            zzjt.zza((Class<zzc>) zzc.class, zzcVar);
        }

        private zzc() {
        }

        public final boolean zzd() {
            return this.zzg;
        }

        public final boolean zze() {
            return this.zzh;
        }

        public final boolean zzf() {
            return (this.zze & 2) != 0;
        }

        public final boolean zzg() {
            return (this.zze & 4) != 0;
        }

        public final boolean zzh() {
            return (this.zze & 8) != 0;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
    /* loaded from: classes7.dex */
    public static final class zzd extends zzjt<zzd, zza> implements zzle {
        private static final zzd zzc;
        private static volatile zzll<zzd> zzd;
        private int zze;
        private long zzf;
        private int zzh;
        private boolean zzm;
        private zza zzr;
        private zzf zzs;
        private zzi zzt;
        private zzg zzu;
        private zze zzv;
        private String zzg = "";
        private zzkc<zzh> zzi = zzjt.zzch();
        private zzkc<zzc> zzj = zzjt.zzch();
        private zzkc<zzfo.zza> zzk = zzjt.zzch();
        private String zzl = "";
        private zzkc<zzgd.zzc> zzn = zzjt.zzch();
        private zzkc<zzb> zzo = zzjt.zzch();
        private String zzp = "";
        private String zzq = "";

        /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
        public static final class zza extends zzjt.zzb<zzd, zza> implements zzle {
            public final int zza() {
                return ((zzd) this.zza).zzb();
            }

            public final zzc zza(int i) {
                return ((zzd) this.zza).zza(i);
            }

            public final zza zzb() {
                zzak();
                zzd.zza((zzd) this.zza);
                return this;
            }

            public final zza zza(int i, zzc.zza zzaVar) {
                zzak();
                zzd.zza((zzd) this.zza, i, (zzc) ((zzjt) zzaVar.zzai()));
                return this;
            }

            public final String zzc() {
                return ((zzd) this.zza).zzj();
            }

            public final List<zzfo.zza> zzd() {
                return Collections.unmodifiableList(((zzd) this.zza).zzk());
            }

            public final List<zzb> zze() {
                return Collections.unmodifiableList(((zzd) this.zza).zzl());
            }

            private zza() {
                super(zzd.zzc);
            }
        }

        public final int zza() {
            return this.zzn.size();
        }

        public final int zzb() {
            return this.zzj.size();
        }

        public final long zzc() {
            return this.zzf;
        }

        public final zza zzd() {
            zza zzaVar = this.zzr;
            return zzaVar == null ? zza.zzb() : zzaVar;
        }

        public final zzc zza(int i) {
            return this.zzj.get(i);
        }

        public static zza zze() {
            return zzc.zzcc();
        }

        public static zzd zzg() {
            return zzc;
        }

        public final zzi zzh() {
            zzi zziVar = this.zzt;
            return zziVar == null ? zzi.zzc() : zziVar;
        }

        @Override // com.google.android.gms.internal.measurement.zzjt
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzft.zza[i - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zza();
                case 3:
                    return zzjt.zza(zzc, "\u0004\u0011\u0000\u0001\u0001\u0013\u0011\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", zzh.class, "zzj", zzc.class, "zzk", zzfo.zza.class, "zzl", "zzm", "zzn", zzgd.zzc.class, "zzo", zzb.class, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv"});
                case 4:
                    return zzc;
                case 5:
                    zzll<zzd> zzaVar = zzd;
                    if (zzaVar == null) {
                        synchronized (zzd.class) {
                            try {
                                zzaVar = zzd;
                                if (zzaVar == null) {
                                    zzaVar = new zzjt.zza<>(zzc);
                                    zzd = zzaVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzaVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final String zzi() {
            return this.zzg;
        }

        public final String zzj() {
            return this.zzp;
        }

        public final List<zzfo.zza> zzk() {
            return this.zzk;
        }

        public final List<zzb> zzl() {
            return this.zzo;
        }

        public final List<zzgd.zzc> zzm() {
            return this.zzn;
        }

        public final List<zzh> zzn() {
            return this.zzi;
        }

        public static /* synthetic */ void zza(zzd zzdVar) {
            zzdVar.zzk = zzjt.zzch();
        }

        public static /* synthetic */ void zza(zzd zzdVar, int i, zzc zzcVar) {
            zzcVar.getClass();
            zzkc<zzc> zzkcVar = zzdVar.zzj;
            if (!zzkcVar.zzc()) {
                zzdVar.zzj = zzjt.zza(zzkcVar);
            }
            zzdVar.zzj.set(i, zzcVar);
        }

        static {
            zzd zzdVar = new zzd();
            zzc = zzdVar;
            zzjt.zza((Class<zzd>) zzd.class, zzdVar);
        }

        private zzd() {
        }

        public final boolean zzo() {
            return (this.zze & 128) != 0;
        }

        public final boolean zzp() {
            return (this.zze & 2) != 0;
        }

        public final boolean zzq() {
            return (this.zze & 512) != 0;
        }

        public final boolean zzr() {
            return (this.zze & 1) != 0;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
    /* loaded from: classes7.dex */
    public static final class zzi extends zzjt<zzi, zza> implements zzle {
        private static final zzi zzc;
        private static volatile zzll<zzi> zzd;
        private int zze;
        private String zzf = "";
        private String zzg = "";
        private String zzh = "";
        private int zzi;

        /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
        public static final class zza extends zzjt.zzb<zzi, zza> implements zzle {
            private zza() {
                super(zzi.zzc);
            }
        }

        public final int zza() {
            return this.zzi;
        }

        public static zzi zzc() {
            return zzc;
        }

        @Override // com.google.android.gms.internal.measurement.zzjt
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzft.zza[i - 1]) {
                case 1:
                    return new zzi();
                case 2:
                    return new zza();
                case 3:
                    return zzjt.zza(zzc, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
                case 4:
                    return zzc;
                case 5:
                    zzll<zzi> zzaVar = zzd;
                    if (zzaVar == null) {
                        synchronized (zzi.class) {
                            try {
                                zzaVar = zzd;
                                if (zzaVar == null) {
                                    zzaVar = new zzjt.zza<>(zzc);
                                    zzd = zzaVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzaVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final String zzd() {
            return this.zzg;
        }

        public final String zze() {
            return this.zzf;
        }

        static {
            zzi zziVar = new zzi();
            zzc = zziVar;
            zzjt.zza((Class<zzi>) zzi.class, zziVar);
        }

        private zzi() {
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
    /* loaded from: classes7.dex */
    public static final class zzb extends zzjt<zzb, zza> implements zzle {
        private static final zzb zzc;
        private static volatile zzll<zzb> zzd;
        private int zze;
        private String zzf = "";
        private zzkc<zzg> zzg = zzjt.zzch();
        private boolean zzh;

        /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
        public static final class zza extends zzjt.zzb<zzb, zza> implements zzle {
            private zza() {
                super(zzb.zzc);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjt
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzft.zza[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza();
                case 3:
                    return zzjt.zza(zzc, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zze", "zzf", "zzg", zzg.class, "zzh"});
                case 4:
                    return zzc;
                case 5:
                    zzll<zzb> zzaVar = zzd;
                    if (zzaVar == null) {
                        synchronized (zzb.class) {
                            try {
                                zzaVar = zzd;
                                if (zzaVar == null) {
                                    zzaVar = new zzjt.zza<>(zzc);
                                    zzd = zzaVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzaVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final String zzb() {
            return this.zzf;
        }

        static {
            zzb zzbVar = new zzb();
            zzc = zzbVar;
            zzjt.zza((Class<zzb>) zzb.class, zzbVar);
        }

        private zzb() {
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
    /* loaded from: classes7.dex */
    public static final class zze extends zzjt<zze, zza> implements zzle {
        private static final zze zzc;
        private static volatile zzll<zze> zzd;
        private zzkc<String> zze = zzjt.zzch();

        /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
        public static final class zza extends zzjt.zzb<zze, zza> implements zzle {
            private zza() {
                super(zze.zzc);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjt
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzft.zza[i - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zza();
                case 3:
                    return zzjt.zza(zzc, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zze"});
                case 4:
                    return zzc;
                case 5:
                    zzll<zze> zzaVar = zzd;
                    if (zzaVar == null) {
                        synchronized (zze.class) {
                            try {
                                zzaVar = zzd;
                                if (zzaVar == null) {
                                    zzaVar = new zzjt.zza<>(zzc);
                                    zzd = zzaVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzaVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zze zzeVar = new zze();
            zzc = zzeVar;
            zzjt.zza((Class<zze>) zze.class, zzeVar);
        }

        private zze() {
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
    /* loaded from: classes7.dex */
    public static final class zzf extends zzjt<zzf, zza> implements zzle {
        private static final zzf zzc;
        private static volatile zzll<zzf> zzd;
        private int zze;
        private int zzf = 14;
        private int zzg = 11;
        private int zzh = 60;

        /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
        public static final class zza extends zzjt.zzb<zzf, zza> implements zzle {
            private zza() {
                super(zzf.zzc);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjt
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzft.zza[i - 1]) {
                case 1:
                    return new zzf();
                case 2:
                    return new zza();
                case 3:
                    return zzjt.zza(zzc, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
                case 4:
                    return zzc;
                case 5:
                    zzll<zzf> zzaVar = zzd;
                    if (zzaVar == null) {
                        synchronized (zzf.class) {
                            try {
                                zzaVar = zzd;
                                if (zzaVar == null) {
                                    zzaVar = new zzjt.zza<>(zzc);
                                    zzd = zzaVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzaVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzf zzfVar = new zzf();
            zzc = zzfVar;
            zzjt.zza((Class<zzf>) zzf.class, zzfVar);
        }

        private zzf() {
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
    /* loaded from: classes7.dex */
    public static final class zzg extends zzjt<zzg, zza> implements zzle {
        private static final zzg zzc;
        private static volatile zzll<zzg> zzd;
        private int zze;
        private String zzf = "";
        private String zzg = "";

        /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
        public static final class zza extends zzjt.zzb<zzg, zza> implements zzle {
            private zza() {
                super(zzg.zzc);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjt
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzft.zza[i - 1]) {
                case 1:
                    return new zzg();
                case 2:
                    return new zza();
                case 3:
                    return zzjt.zza(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
                case 4:
                    return zzc;
                case 5:
                    zzll<zzg> zzaVar = zzd;
                    if (zzaVar == null) {
                        synchronized (zzg.class) {
                            try {
                                zzaVar = zzd;
                                if (zzaVar == null) {
                                    zzaVar = new zzjt.zza<>(zzc);
                                    zzd = zzaVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzaVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            zzg zzgVar = new zzg();
            zzc = zzgVar;
            zzjt.zza((Class<zzg>) zzg.class, zzgVar);
        }

        private zzg() {
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
    /* loaded from: classes7.dex */
    public static final class zzh extends zzjt<zzh, zza> implements zzle {
        private static final zzh zzc;
        private static volatile zzll<zzh> zzd;
        private int zze;
        private String zzf = "";
        private String zzg = "";

        /* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
        public static final class zza extends zzjt.zzb<zzh, zza> implements zzle {
            private zza() {
                super(zzh.zzc);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzjt
        public final Object zza(int i, Object obj, Object obj2) {
            switch (zzft.zza[i - 1]) {
                case 1:
                    return new zzh();
                case 2:
                    return new zza();
                case 3:
                    return zzjt.zza(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
                case 4:
                    return zzc;
                case 5:
                    zzll<zzh> zzaVar = zzd;
                    if (zzaVar == null) {
                        synchronized (zzh.class) {
                            try {
                                zzaVar = zzd;
                                if (zzaVar == null) {
                                    zzaVar = new zzjt.zza<>(zzc);
                                    zzd = zzaVar;
                                }
                            } finally {
                            }
                        }
                    }
                    return zzaVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final String zzb() {
            return this.zzf;
        }

        public final String zzc() {
            return this.zzg;
        }

        static {
            zzh zzhVar = new zzh();
            zzc = zzhVar;
            zzjt.zza((Class<zzh>) zzh.class, zzhVar);
        }

        private zzh() {
        }
    }
}
