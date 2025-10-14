package org.jfrog.filespecs.entities;

import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.text.ExtendedMessageFormat;

/* loaded from: classes5.dex */
public class FilesGroup {
    public Aql aql;
    public String build;

    @Deprecated
    public String[] excludePatterns;
    public String[] exclusions;
    public String explode;
    public String flat;
    public String limit;
    public String offset;
    public String pattern;
    public String props;
    public String recursive;
    public String regexp;
    public String[] sortBy;
    public String sortOrder;
    public String target;
    public String targetProps;

    public enum SpecType {
        BUILD,
        PATTERN,
        AQL
    }

    public String getAql() {
        Aql aql = this.aql;
        if (aql != null) {
            return aql.getFind();
        }
        return null;
    }

    public FilesGroup setAql(Aql aql) {
        this.aql = aql;
        return this;
    }

    public String getPattern() {
        return this.pattern;
    }

    public FilesGroup setPattern(String str) {
        this.pattern = str;
        return this;
    }

    public String getTarget() {
        return this.target;
    }

    public FilesGroup setTarget(String str) {
        this.target = str;
        return this;
    }

    public String getProps() {
        return this.props;
    }

    public FilesGroup setProps(String str) {
        this.props = str;
        return this;
    }

    public String getTargetProps() {
        return this.targetProps;
    }

    public FilesGroup setTargetProps(String str) {
        this.targetProps = str;
        return this;
    }

    public String getRecursive() {
        return this.recursive;
    }

    public FilesGroup setRecursive(String str) {
        this.recursive = str;
        return this;
    }

    public String getFlat() {
        return this.flat;
    }

    public FilesGroup setFlat(String str) {
        this.flat = str;
        return this;
    }

    public String getRegexp() {
        return this.regexp;
    }

    public FilesGroup setRegexp(String str) {
        this.regexp = str;
        return this;
    }

    public String getBuild() {
        return this.build;
    }

    public void setBuild(String str) {
        this.build = str;
    }

    public String getExplode() {
        return this.explode;
    }

    public FilesGroup setExplode(String str) {
        this.explode = str;
        return this;
    }

    public String[] getExclusions() {
        return this.exclusions;
    }

    public FilesGroup setExclusions(String[] strArr) {
        this.exclusions = strArr;
        return this;
    }

    public String getExclusion(int i) {
        return this.exclusions[i];
    }

    public String[] getSortBy() {
        String[] strArr = this.sortBy;
        return strArr != null ? strArr : ArrayUtils.EMPTY_STRING_ARRAY;
    }

    public FilesGroup setSortBy(String[] strArr) {
        this.sortBy = strArr;
        return this;
    }

    public String getSortOrder() {
        return this.sortOrder;
    }

    public FilesGroup setSortOrder(String str) {
        this.sortOrder = str;
        return this;
    }

    public String getLimit() {
        return this.limit;
    }

    public FilesGroup setLimit(String str) {
        this.limit = str;
        return this;
    }

    public String getOffset() {
        return this.offset;
    }

    public FilesGroup setOffset(String str) {
        this.offset = str;
        return this;
    }

    @Deprecated
    public String[] getExcludePatterns() {
        return this.excludePatterns;
    }

    @Deprecated
    public void setExcludePatterns(String[] strArr) {
        this.excludePatterns = strArr;
    }

    @Deprecated
    public String getExcludePattern(int i) {
        return this.excludePatterns[i];
    }

    @Deprecated
    public void setExcludePattern(String str, int i) {
        this.excludePatterns[i] = str;
    }

    public String toString() {
        return "FilesGroup{aql=" + this.aql + ", pattern='" + this.pattern + ExtendedMessageFormat.QUOTE + ", target='" + this.target + ExtendedMessageFormat.QUOTE + ", props='" + this.props + ExtendedMessageFormat.QUOTE + ", targetProps='" + this.targetProps + ExtendedMessageFormat.QUOTE + ", recursive='" + this.recursive + ExtendedMessageFormat.QUOTE + ", flat='" + this.flat + ExtendedMessageFormat.QUOTE + ", regexp='" + this.regexp + ExtendedMessageFormat.QUOTE + ", build='" + this.build + ExtendedMessageFormat.QUOTE + ", explode='" + this.explode + ExtendedMessageFormat.QUOTE + ", exclusions=" + Arrays.toString(this.exclusions) + ", excludePatterns=" + Arrays.toString(this.excludePatterns) + ", sortBy=" + Arrays.toString(this.sortBy) + ", sortOrder='" + this.sortOrder + ExtendedMessageFormat.QUOTE + ", limit='" + this.limit + ExtendedMessageFormat.QUOTE + ", offset='" + this.offset + ExtendedMessageFormat.QUOTE + '}';
    }

    public SpecType getSpecType() {
        if (StringUtils.isNotEmpty(this.build) && StringUtils.isEmpty(getAql()) && (StringUtils.isEmpty(this.pattern) || this.pattern.equals("*"))) {
            return SpecType.BUILD;
        }
        if (StringUtils.isNotEmpty(this.pattern)) {
            return SpecType.PATTERN;
        }
        if (StringUtils.isNotEmpty(getAql())) {
            return SpecType.AQL;
        }
        return null;
    }
}
