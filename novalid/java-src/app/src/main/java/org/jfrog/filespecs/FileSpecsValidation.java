package org.jfrog.filespecs;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.jfrog.filespecs.entities.FilesGroup;
import org.jfrog.filespecs.entities.InvalidFileSpecException;
import org.jfrog.filespecs.utils.Log;
import org.jfrog.filespecs.utils.NullLog;

/* loaded from: classes5.dex */
public class FileSpecsValidation {
    public static void validateSearchBasedFileSpec(FileSpec fileSpec, Log log) throws InvalidFileSpecException {
        if (fileSpec.getFiles() == null || fileSpec.getFiles().size() == 0) {
            throw new InvalidFileSpecException("A file spec must contain at least one files group");
        }
        for (FilesGroup filesGroup : fileSpec.getFiles()) {
            boolean zIsNotBlank = StringUtils.isNotBlank(filesGroup.getAql());
            boolean zIsNotBlank2 = StringUtils.isNotBlank(filesGroup.getPattern());
            boolean zIsNotBlank3 = StringUtils.isNotBlank(filesGroup.getBuild());
            boolean z = false;
            if (!ArrayUtils.isEmpty(filesGroup.getExcludePatterns()) && StringUtils.isNotBlank(filesGroup.getExcludePattern(0))) {
                z = true;
            }
            if (!zIsNotBlank && !zIsNotBlank2 && !zIsNotBlank3) {
                throw new InvalidFileSpecException("A search-based file spec must contain 'aql' or 'pattern', and/or 'build'");
            }
            validateQueryInputs(filesGroup);
            if (z) {
                log.warn("The 'excludePatterns' File Spec property is deprecated.\nPlease use the 'exclusions' property instead.\nUnlike 'excludePatterns', 'exclusions' take into account the repository as part of the pattern.\nFor example: \n\"excludePatterns\": [\"a.zip\"]\ncan be translated to\n\"exclusions\": [\"repo-name/a.zip\"]\nor\n\"exclusions\": [\"*/a.zip\"]");
            }
        }
    }

    public static void validateSearchBasedFileSpec(FileSpec fileSpec) throws InvalidFileSpecException {
        validateSearchBasedFileSpec(fileSpec, new NullLog());
    }

    public static void validateUploadFileSpec(FileSpec fileSpec, Log log) throws InvalidFileSpecException {
        if (fileSpec.getFiles().size() == 0) {
            throw new InvalidFileSpecException("A file spec must contain at least one files group");
        }
        for (FilesGroup filesGroup : fileSpec.getFiles()) {
            boolean zIsNotBlank = StringUtils.isNotBlank(filesGroup.getAql());
            boolean zIsNotBlank2 = StringUtils.isNotBlank(filesGroup.getPattern());
            boolean z = !ArrayUtils.isEmpty(filesGroup.getExcludePatterns());
            if (zIsNotBlank) {
                throw new InvalidFileSpecException("AQL is not supported in upload file spec");
            }
            if (!zIsNotBlank2) {
                throw new InvalidFileSpecException("Upload file spec must contain 'pattern'");
            }
            if (StringUtils.isBlank(filesGroup.getTarget())) {
                throw new InvalidFileSpecException("Upload file spec must contain 'target'");
            }
            validateQueryInputs(filesGroup);
            if (z) {
                log.warn("The 'excludePatterns' File Spec property is deprecated.\nPlease use the 'exclusions' property instead.\nUnlike 'excludePatterns', 'exclusions' take into account the repository as part of the pattern.\nFor example: \n\"excludePatterns\": [\"a.zip\"]\ncan be translated to\n\"exclusions\": [\"repo-name/a.zip\"]\nor\n\"exclusions\": [\"*/a.zip\"]");
            }
        }
    }

    public static void validateUploadFileSpec(FileSpec fileSpec) throws InvalidFileSpecException {
        validateUploadFileSpec(fileSpec, new NullLog());
    }

    public static void validateQueryInputs(FilesGroup filesGroup) throws InvalidFileSpecException {
        boolean zIsNotBlank = StringUtils.isNotBlank(filesGroup.getAql());
        boolean zIsNotBlank2 = StringUtils.isNotBlank(filesGroup.getPattern());
        boolean z = !ArrayUtils.isEmpty(filesGroup.getExclusions()) && StringUtils.isNotBlank(filesGroup.getExclusion(0));
        boolean z2 = !ArrayUtils.isEmpty(filesGroup.getExcludePatterns()) && StringUtils.isNotBlank(filesGroup.getExcludePattern(0));
        if (zIsNotBlank && zIsNotBlank2) {
            throw new InvalidFileSpecException("Spec can't contain both AQL and Pattern keys");
        }
        if (zIsNotBlank && (z || z2)) {
            throw new InvalidFileSpecException("Spec can't contain both AQL and Exclusions keys");
        }
        if (z2 && z) {
            throw new InvalidFileSpecException("Spec can't contain both Exclusions and ExcludePatterns keys");
        }
    }
}
