package me.glorantq.modbot.data;

import me.glorantq.modbot.module.JavaModule;

/**
 * Interface to help storing guild-specific data
 * @author glorantq
 */
public interface IGuildData {

    /**
     * Store generic binary data
     * @param owner The module the data belongs to
     * @param key Key of the data
     * @param data The data itself
     * @return 0 if failed, greater than 0 if successful
     */
    int storeData(JavaModule owner, String key, byte[] data);

    /**
     * Retrieve generic binary data
     * @param owner The module the data belongs to
     * @param key Key of the data
     * @return The previously stored byte array
     */
    byte[] getData(JavaModule owner, String key);

    /**
     * Store a String
     * @param owner The module the data belongs to
     * @param key Key of the data
     * @param value The value
     * @return 0 if failed, greater than 0 if successful
     */
    int storeString(JavaModule owner, String key, String value);

    /**
     * Retrieve a previously stored string
     * @param owner The module the data belongs to
     * @param key Key of the data
     * @return The previously stored string
     */
    String getString(JavaModule owner, String key);

    /**
     * Store a boolean
     * @param owner The module the data belongs to
     * @param key Key of the data
     * @param value The value
     * @return 0 if failed, greater than 0 if successful
     */
    int storeBoolean(JavaModule owner, String key, boolean value);

    /**
     * Retrieve a previously stored boolean
     * @param owner The module the data belongs to
     * @param key Key of the data
     * @return The previously stored boolean
     */
    boolean getBoolean(JavaModule owner, String key);

    /**
     * Store an integer
     * @param owner The module the data belongs to
     * @param key Key of the data
     * @param value The value
     * @return 0 if failed, greater than 0 if successful
     */
    int storeInt(JavaModule owner, String key, int value);

    /**
     * Retrieve a previously stored integer
     * @param owner The module the data belongs to
     * @param key Key of the data
     * @return The previously stored integer
     */
    int getInt(JavaModule owner, String key);

    /**
     * Store a double
     * @param owner The module the data belongs to
     * @param key Key of the data
     * @param value The value
     * @return 0 if failed, greater than 0 if successful
     */
    int storeDouble(JavaModule owner, String key, double value);

    /**
     * Retrieve a previously stored double
     * @param owner The module the data belongs to
     * @param key Key of the data
     * @return The previously stored double
     */
    double getDouble(JavaModule owner, String key);

    /**
     * Store a float
     * @param owner The module the data belongs to
     * @param key Key of the data
     * @param value The value
     * @return 0 if failed, greater than 0 if successful
     */
    int storeFloat(JavaModule owner, String key, float value);

    /**
     * Retrieve a previously stored float
     * @param owner The module the data belongs to
     * @param key Key of the data
     * @return The previously stored float
     */
    float getFloat(JavaModule owner, String key);

    /**
     * Store a long
     * @param owner The module the data belongs to
     * @param key Key of the data
     * @param value The value
     * @return 0 if failed, greater than 0 if successful
     */
    int storeLong(JavaModule owner, String key, long value);

    /**
     * Retrieve a previously stored long
     * @param owner The module the data belongs to
     * @param key Key of the data
     * @return The previously stored long
     */
    long getLong(JavaModule owner, String key);

    /**
     * Store a byte
     * @param owner The module the data belongs to
     * @param key Key of the data
     * @param value The value
     * @return 0 if failed, greater than 0 if successful
     */
    int storeByte(JavaModule owner, String key, byte value);

    /**
     * Retrieve a previously stored byte
     * @param owner The module the data belongs to
     * @param key Key of the data
     * @return The previously stored byte
     */
    byte getByte(JavaModule owner, String key);

    /**
     * Store an Object
     * @param owner The module the data belongs to
     * @param key Key of the data
     * @param value The object to store
     * @return 0 if failed, greater than 0 if successful
     */
    int storeObject(JavaModule owner, String key, Object value);

    /**
     * Retrieve a previously stored Object
     * @param owner The module the data belongs to
     * @param key Key of the data
     * @return The previously stored Object
     */
    Object getObject(JavaModule owner, String key);
}
