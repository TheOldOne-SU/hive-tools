/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.ranger.binding.metastore.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-04-01")
public class TFetchUpdatesResponse implements org.apache.thrift.TBase<TFetchUpdatesResponse, TFetchUpdatesResponse._Fields>, java.io.Serializable, Cloneable, Comparable<TFetchUpdatesResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TFetchUpdatesResponse");

  private static final org.apache.thrift.protocol.TField PROTOCOL_VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("protocol_version", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField DELTAS_FIELD_DESC = new org.apache.thrift.protocol.TField("deltas", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TFetchUpdatesResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TFetchUpdatesResponseTupleSchemeFactory());
  }

  /**
   * 
   * @see MetaStoreUpdateServiceVersion
   */
  public MetaStoreUpdateServiceVersion protocol_version; // required
  public List<TUpdateDelta> deltas; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see MetaStoreUpdateServiceVersion
     */
    PROTOCOL_VERSION((short)1, "protocol_version"),
    DELTAS((short)2, "deltas");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // PROTOCOL_VERSION
          return PROTOCOL_VERSION;
        case 2: // DELTAS
          return DELTAS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PROTOCOL_VERSION, new org.apache.thrift.meta_data.FieldMetaData("protocol_version", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, MetaStoreUpdateServiceVersion.class)));
    tmpMap.put(_Fields.DELTAS, new org.apache.thrift.meta_data.FieldMetaData("deltas", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TUpdateDelta.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TFetchUpdatesResponse.class, metaDataMap);
  }

  public TFetchUpdatesResponse() {
    this.protocol_version = org.apache.ranger.binding.metastore.thrift.MetaStoreUpdateServiceVersion.V1;

  }

  public TFetchUpdatesResponse(
    MetaStoreUpdateServiceVersion protocol_version,
    List<TUpdateDelta> deltas)
  {
    this();
    this.protocol_version = protocol_version;
    this.deltas = deltas;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TFetchUpdatesResponse(TFetchUpdatesResponse other) {
    if (other.isSetProtocol_version()) {
      this.protocol_version = other.protocol_version;
    }
    if (other.isSetDeltas()) {
      List<TUpdateDelta> __this__deltas = new ArrayList<TUpdateDelta>(other.deltas.size());
      for (TUpdateDelta other_element : other.deltas) {
        __this__deltas.add(new TUpdateDelta(other_element));
      }
      this.deltas = __this__deltas;
    }
  }

  public TFetchUpdatesResponse deepCopy() {
    return new TFetchUpdatesResponse(this);
  }

  @Override
  public void clear() {
    this.protocol_version = org.apache.ranger.binding.metastore.thrift.MetaStoreUpdateServiceVersion.V1;

    this.deltas = null;
  }

  /**
   * 
   * @see MetaStoreUpdateServiceVersion
   */
  public MetaStoreUpdateServiceVersion getProtocol_version() {
    return this.protocol_version;
  }

  /**
   * 
   * @see MetaStoreUpdateServiceVersion
   */
  public TFetchUpdatesResponse setProtocol_version(MetaStoreUpdateServiceVersion protocol_version) {
    this.protocol_version = protocol_version;
    return this;
  }

  public void unsetProtocol_version() {
    this.protocol_version = null;
  }

  /** Returns true if field protocol_version is set (has been assigned a value) and false otherwise */
  public boolean isSetProtocol_version() {
    return this.protocol_version != null;
  }

  public void setProtocol_versionIsSet(boolean value) {
    if (!value) {
      this.protocol_version = null;
    }
  }

  public int getDeltasSize() {
    return (this.deltas == null) ? 0 : this.deltas.size();
  }

  public java.util.Iterator<TUpdateDelta> getDeltasIterator() {
    return (this.deltas == null) ? null : this.deltas.iterator();
  }

  public void addToDeltas(TUpdateDelta elem) {
    if (this.deltas == null) {
      this.deltas = new ArrayList<TUpdateDelta>();
    }
    this.deltas.add(elem);
  }

  public List<TUpdateDelta> getDeltas() {
    return this.deltas;
  }

  public TFetchUpdatesResponse setDeltas(List<TUpdateDelta> deltas) {
    this.deltas = deltas;
    return this;
  }

  public void unsetDeltas() {
    this.deltas = null;
  }

  /** Returns true if field deltas is set (has been assigned a value) and false otherwise */
  public boolean isSetDeltas() {
    return this.deltas != null;
  }

  public void setDeltasIsSet(boolean value) {
    if (!value) {
      this.deltas = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PROTOCOL_VERSION:
      if (value == null) {
        unsetProtocol_version();
      } else {
        setProtocol_version((MetaStoreUpdateServiceVersion)value);
      }
      break;

    case DELTAS:
      if (value == null) {
        unsetDeltas();
      } else {
        setDeltas((List<TUpdateDelta>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PROTOCOL_VERSION:
      return getProtocol_version();

    case DELTAS:
      return getDeltas();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PROTOCOL_VERSION:
      return isSetProtocol_version();
    case DELTAS:
      return isSetDeltas();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TFetchUpdatesResponse)
      return this.equals((TFetchUpdatesResponse)that);
    return false;
  }

  public boolean equals(TFetchUpdatesResponse that) {
    if (that == null)
      return false;

    boolean this_present_protocol_version = true && this.isSetProtocol_version();
    boolean that_present_protocol_version = true && that.isSetProtocol_version();
    if (this_present_protocol_version || that_present_protocol_version) {
      if (!(this_present_protocol_version && that_present_protocol_version))
        return false;
      if (!this.protocol_version.equals(that.protocol_version))
        return false;
    }

    boolean this_present_deltas = true && this.isSetDeltas();
    boolean that_present_deltas = true && that.isSetDeltas();
    if (this_present_deltas || that_present_deltas) {
      if (!(this_present_deltas && that_present_deltas))
        return false;
      if (!this.deltas.equals(that.deltas))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_protocol_version = true && (isSetProtocol_version());
    list.add(present_protocol_version);
    if (present_protocol_version)
      list.add(protocol_version.getValue());

    boolean present_deltas = true && (isSetDeltas());
    list.add(present_deltas);
    if (present_deltas)
      list.add(deltas);

    return list.hashCode();
  }

  @Override
  public int compareTo(TFetchUpdatesResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetProtocol_version()).compareTo(other.isSetProtocol_version());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetProtocol_version()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.protocol_version, other.protocol_version);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDeltas()).compareTo(other.isSetDeltas());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDeltas()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.deltas, other.deltas);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TFetchUpdatesResponse(");
    boolean first = true;

    sb.append("protocol_version:");
    if (this.protocol_version == null) {
      sb.append("null");
    } else {
      sb.append(this.protocol_version);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("deltas:");
    if (this.deltas == null) {
      sb.append("null");
    } else {
      sb.append(this.deltas);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (protocol_version == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'protocol_version' was not present! Struct: " + toString());
    }
    if (deltas == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'deltas' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TFetchUpdatesResponseStandardSchemeFactory implements SchemeFactory {
    public TFetchUpdatesResponseStandardScheme getScheme() {
      return new TFetchUpdatesResponseStandardScheme();
    }
  }

  private static class TFetchUpdatesResponseStandardScheme extends StandardScheme<TFetchUpdatesResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TFetchUpdatesResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PROTOCOL_VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.protocol_version = org.apache.ranger.binding.metastore.thrift.MetaStoreUpdateServiceVersion.findByValue(iprot.readI32());
              struct.setProtocol_versionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DELTAS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list8 = iprot.readListBegin();
                struct.deltas = new ArrayList<TUpdateDelta>(_list8.size);
                TUpdateDelta _elem9;
                for (int _i10 = 0; _i10 < _list8.size; ++_i10)
                {
                  _elem9 = new TUpdateDelta();
                  _elem9.read(iprot);
                  struct.deltas.add(_elem9);
                }
                iprot.readListEnd();
              }
              struct.setDeltasIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TFetchUpdatesResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.protocol_version != null) {
        oprot.writeFieldBegin(PROTOCOL_VERSION_FIELD_DESC);
        oprot.writeI32(struct.protocol_version.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.deltas != null) {
        oprot.writeFieldBegin(DELTAS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.deltas.size()));
          for (TUpdateDelta _iter11 : struct.deltas)
          {
            _iter11.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TFetchUpdatesResponseTupleSchemeFactory implements SchemeFactory {
    public TFetchUpdatesResponseTupleScheme getScheme() {
      return new TFetchUpdatesResponseTupleScheme();
    }
  }

  private static class TFetchUpdatesResponseTupleScheme extends TupleScheme<TFetchUpdatesResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TFetchUpdatesResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.protocol_version.getValue());
      {
        oprot.writeI32(struct.deltas.size());
        for (TUpdateDelta _iter12 : struct.deltas)
        {
          _iter12.write(oprot);
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TFetchUpdatesResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.protocol_version = org.apache.ranger.binding.metastore.thrift.MetaStoreUpdateServiceVersion.findByValue(iprot.readI32());
      struct.setProtocol_versionIsSet(true);
      {
        org.apache.thrift.protocol.TList _list13 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
        struct.deltas = new ArrayList<TUpdateDelta>(_list13.size);
        TUpdateDelta _elem14;
        for (int _i15 = 0; _i15 < _list13.size; ++_i15)
        {
          _elem14 = new TUpdateDelta();
          _elem14.read(iprot);
          struct.deltas.add(_elem14);
        }
      }
      struct.setDeltasIsSet(true);
    }
  }

}

