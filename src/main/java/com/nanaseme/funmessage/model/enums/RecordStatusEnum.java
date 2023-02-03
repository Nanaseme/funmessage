package com.nanaseme.funmessage.model.enums;

/**
 * 状态标志 枚举类
 *
 * @author WangZD
 */
public enum RecordStatusEnum {

    /**
     * OFF
     */
    OFF("0", "OFF", "停用"),
    /**
     * ON
     */
    ON("1", "ON", "在用"),
    ;

    /**
     * 枚举编码
     */
    private String code;
    /**
     * 枚举名称
     */
    private String name;
    /**
     * 枚举详情
     */
    private String description;

    /**
     * 构造方法
     *
     * @param code
     * @param name
     * @param description
     */
    RecordStatusEnum(String code, String name, String description) {
        this.code = code;
        this.name = name;
        this.description = description;
    }

    /**
     * 通过枚举code获得枚举
     *
     * @param code 枚举编码
     * @return 枚举
     */
    public static RecordStatusEnum getByCode(String code) {
        for (RecordStatusEnum recordStatusEnum : values()) {
            if (recordStatusEnum.getCode().equals(code)) {
                return recordStatusEnum;
            }
        }

        return null;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return code;
    }

}