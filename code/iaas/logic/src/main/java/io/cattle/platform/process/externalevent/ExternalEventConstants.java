package io.cattle.platform.process.externalevent;

public class ExternalEventConstants {

    public static final String KIND_VOLUME_EVENT = "externalVolumeEvent";
    public static final String KIND_STORAGE_POOL_EVENT = "externalStoragePoolEvent";
    public static final String FIELD_REPORTED_ACCOUNT_ID = "reportedAccountId";
    public static final String FIELD_HOST_UUIDS = "hostUuids";
    public static final String TYPE_VOLUME_CREATE = "volume.create";
    public static final String TYPE_VOLUME_DELETE = "volume.delete";
    public static final String VOLUME_POOL_LOCK_NAME = "VOLUME";
    public static final String STORAGE_POOL_LOCK_NAME = "STORAGEPOOL";
    public static final String FIELD_STORAGE_POOL = "storagePool";
    public static final String FIELD_VOLUME = "volume";
    public static final String FIELD_ZONE_ID = "zoneId";
    public static final String FIELD_SP_EXT_ID = "storagePoolExternalId";
    public static final String FIELD_ATTACHED_STATE = "attachedState";
    public static final String FIELD_ALLOC_STATE = "allocationState";
    public static final String FIELD_DEV_NUM = "deviceNumber";
    public static final String FIELD_VOL_ID = "deviceNumber";
    public static final String FIELD_SP_ID = "deviceNumber";
    public static final String PROC_VOL_MAP_CREATE = "volumestoragepoolmap.create";
    public static final String PROC_VOL_MAP_ACTIVATE = "volumestoragepoolmap.activate";
    public static final String PROC_VOL_DEACTIVATE = "volume.deactivate";
    public static final String PROC_VOL_REMOVE = "volume.remove";
}
