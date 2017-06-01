package com.airbnb.epoxy;

import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.annotation.PluralsRes;
import android.support.annotation.StringRes;
import java.lang.CharSequence;
import java.lang.IllegalArgumentException;
import java.lang.IllegalStateException;
import java.lang.Number;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.BitSet;

/**
 * Generated file. Do not modify! */
public class TestStringOverloadsViewModel_ extends EpoxyModel<TestStringOverloadsView> implements GeneratedModel<TestStringOverloadsView> {
  private final BitSet assignedAttributes_epoxyGeneratedModel = new BitSet(4);

  private OnModelBoundListener<TestStringOverloadsViewModel_, TestStringOverloadsView> onModelBoundListener_epoxyGeneratedModel;

  private OnModelUnboundListener<TestStringOverloadsViewModel_, TestStringOverloadsView> onModelUnboundListener_epoxyGeneratedModel;

  /**
   * Bitset index: 0 */
  private CharSequence title_CharSequence;

  /**
   * Bitset index: 1 */
  @StringRes
  private int title_Int;

  /**
   * Bitset index: 2 */
  private StringAttributeData title_StringResAttribute;

  /**
   * Bitset index: 3 */
  private QuantityStringResAttribute title_QuantityStringResAttribute;

  @Override
  public void addTo(EpoxyController controller) {
    super.addTo(controller);
    addWithDebugValidation(controller);
    if (!assignedAttributes_epoxyGeneratedModel.get(0) && !assignedAttributes_epoxyGeneratedModel.get(1) && !assignedAttributes_epoxyGeneratedModel.get(2) && !assignedAttributes_epoxyGeneratedModel.get(3)) {
    	throw new IllegalStateException("A value is required for setTitle");
    }
  }

  @Override
  public void handlePreBind(final EpoxyViewHolder holder, final TestStringOverloadsView object,
      int position) {
    validateStateHasNotChangedSinceAdded("The model was changed between being added to the controller and being bound.", position);
  }

  @Override
  public void bind(final TestStringOverloadsView object) {
    super.bind(object);
    if (assignedAttributes_epoxyGeneratedModel.get(0)) {
      object.setTitle(title_CharSequence);
    }
    else if (assignedAttributes_epoxyGeneratedModel.get(1)) {
      object.setTitle(object.getContext().getText(title_Int));
    }
    else if (assignedAttributes_epoxyGeneratedModel.get(2)) {
      object.setTitle(title_StringResAttribute.toString(object.getContext()));
    }
    else {
      object.setTitle(title_QuantityStringResAttribute.toString(object.getContext()));
    }
  }

  @Override
  public void bind(final TestStringOverloadsView object, EpoxyModel previousModel) {
    if (!(previousModel instanceof TestStringOverloadsViewModel_)) {
      bind(object);
      return;
    }
    TestStringOverloadsViewModel_ that = (TestStringOverloadsViewModel_) previousModel;

    if (assignedAttributes_epoxyGeneratedModel.equals(that.assignedAttributes_epoxyGeneratedModel)) {
      if (assignedAttributes_epoxyGeneratedModel.get(0)) {
        if (title_CharSequence != null ? !title_CharSequence.equals(that.title_CharSequence) : that.title_CharSequence != null) {
          object.setTitle(title_CharSequence);
        }
      }
       else if (assignedAttributes_epoxyGeneratedModel.get(1)) {
        if (title_Int != that.title_Int) {
          object.setTitle(object.getContext().getText(title_Int));
        }
      }
       else if (assignedAttributes_epoxyGeneratedModel.get(2)) {
        if (title_StringResAttribute != null ? !title_StringResAttribute.equals(that.title_StringResAttribute) : that.title_StringResAttribute != null) {
          object.setTitle(title_StringResAttribute.toString(object.getContext()));
        }
      }
       else if (assignedAttributes_epoxyGeneratedModel.get(3)) {
        if (title_QuantityStringResAttribute != null ? !title_QuantityStringResAttribute.equals(that.title_QuantityStringResAttribute) : that.title_QuantityStringResAttribute != null) {
          object.setTitle(title_QuantityStringResAttribute.toString(object.getContext()));
        }
      }
    }
    else {
      if (assignedAttributes_epoxyGeneratedModel.get(0) && !that.assignedAttributes_epoxyGeneratedModel.get(0)) {
        object.setTitle(title_CharSequence);
      }
       else if (assignedAttributes_epoxyGeneratedModel.get(1) && !that.assignedAttributes_epoxyGeneratedModel.get(1)) {
        object.setTitle(object.getContext().getText(title_Int));
      }
       else if (assignedAttributes_epoxyGeneratedModel.get(2) && !that.assignedAttributes_epoxyGeneratedModel.get(2)) {
        object.setTitle(title_StringResAttribute.toString(object.getContext()));
      }
       else if (assignedAttributes_epoxyGeneratedModel.get(3) && !that.assignedAttributes_epoxyGeneratedModel.get(3)) {
        object.setTitle(title_QuantityStringResAttribute.toString(object.getContext()));
      }
    }
  }

  @Override
  public void handlePostBind(final TestStringOverloadsView object, int position) {
    if (onModelBoundListener_epoxyGeneratedModel != null) {
      onModelBoundListener_epoxyGeneratedModel.onModelBound(this, object, position);
    }
    validateStateHasNotChangedSinceAdded("The model was changed during the bind call.", position);
  }

  /**
   * Register a listener that will be called when this model is bound to a view.
   * <p>
   * The listener will contribute to this model's hashCode state per the {@link
   * com.airbnb.epoxy.EpoxyAttribute.Option#DoNotHash} rules.
   * <p>
   * You may clear the listener by setting a null value, or by calling {@link #reset()} */
  public TestStringOverloadsViewModel_ onBind(OnModelBoundListener<TestStringOverloadsViewModel_, TestStringOverloadsView> listener) {
    onMutation();
    this.onModelBoundListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void unbind(TestStringOverloadsView object) {
    super.unbind(object);
    if (onModelUnboundListener_epoxyGeneratedModel != null) {
      onModelUnboundListener_epoxyGeneratedModel.onModelUnbound(this, object);
    }
  }

  /**
   * Register a listener that will be called when this model is unbound from a view.
   * <p>
   * The listener will contribute to this model's hashCode state per the {@link
   * com.airbnb.epoxy.EpoxyAttribute.Option#DoNotHash} rules.
   * <p>
   * You may clear the listener by setting a null value, or by calling {@link #reset()} */
  public TestStringOverloadsViewModel_ onUnbind(OnModelUnboundListener<TestStringOverloadsViewModel_, TestStringOverloadsView> listener) {
    onMutation();
    this.onModelUnboundListener_epoxyGeneratedModel = listener;
    return this;
  }

  /**
   * <i>Required.</i>
   *
   * @see TestStringOverloadsView#setTitle(CharSequence)
   */
  public TestStringOverloadsViewModel_ title(CharSequence title) {
    if (title == null) {
      throw new IllegalArgumentException("title cannot be null");
    }
    assignedAttributes_epoxyGeneratedModel.set(0);
    assignedAttributes_epoxyGeneratedModel.clear(1);
    this.title_Int = 0;
    assignedAttributes_epoxyGeneratedModel.clear(2);
    this.title_StringResAttribute = null;
    assignedAttributes_epoxyGeneratedModel.clear(3);
    this.title_QuantityStringResAttribute = null;
    onMutation();
    this.title_CharSequence = title;
    return this;
  }

  public CharSequence titleCharSequence() {
    return title_CharSequence;
  }

  /**
   * <i>Required.</i>
   *
   * @see TestStringOverloadsView#setTitle(CharSequence)
   */
  public TestStringOverloadsViewModel_ title(@StringRes int title) {
    assignedAttributes_epoxyGeneratedModel.set(1);
    assignedAttributes_epoxyGeneratedModel.clear(0);
    this.title_CharSequence = null;
    assignedAttributes_epoxyGeneratedModel.clear(2);
    this.title_StringResAttribute = null;
    assignedAttributes_epoxyGeneratedModel.clear(3);
    this.title_QuantityStringResAttribute = null;
    onMutation();
    this.title_Int = title;
    if (title == 0) {
      	throw new IllegalArgumentException("A string resource value of 0 was set for View Prop {view='TestStringOverloadsView', name='setTitle', type=int}");
    }
    return this;
  }

  @StringRes
  public int titleInt() {
    return title_Int;
  }

  /**
   * <i>Required.</i>
   *
   * @see TestStringOverloadsView#setTitle(CharSequence)
   */
  public TestStringOverloadsViewModel_ title(@StringRes int stringRes, Object... formatArgs) {
    assignedAttributes_epoxyGeneratedModel.set(2);
    assignedAttributes_epoxyGeneratedModel.clear(0);
    this.title_CharSequence = null;
    assignedAttributes_epoxyGeneratedModel.clear(1);
    this.title_Int = 0;
    assignedAttributes_epoxyGeneratedModel.clear(3);
    this.title_QuantityStringResAttribute = null;
    onMutation();
    if (stringRes == 0) {
      	throw new IllegalArgumentException("A string resource value of 0 was set for View Prop {view='TestStringOverloadsView', name='setTitle', type=com.airbnb.epoxy.StringResAttribute}");
    }
    return this;
  }

  public StringAttributeData titleStringResAttribute() {
    return title_StringResAttribute;
  }

  /**
   * <i>Required.</i>
   *
   * @see TestStringOverloadsView#setTitle(CharSequence)
   */
  public TestStringOverloadsViewModel_ titleQuantityRes(@PluralsRes int stringRes, int quantity,
      Object... formatArgs) {
    assignedAttributes_epoxyGeneratedModel.set(3);
    assignedAttributes_epoxyGeneratedModel.clear(0);
    this.title_CharSequence = null;
    assignedAttributes_epoxyGeneratedModel.clear(1);
    this.title_Int = 0;
    assignedAttributes_epoxyGeneratedModel.clear(2);
    this.title_StringResAttribute = null;
    onMutation();
    this.title_QuantityStringResAttribute = new QuantityStringResAttribute(stringRes, quantity, formatArgs);
    if (stringRes == 0) {
      	throw new IllegalArgumentException("A string resource value of 0 was set for View Prop {view='TestStringOverloadsView', name='setTitle', type=com.airbnb.epoxy.QuantityStringResAttribute}");
    }
    return this;
  }

  public QuantityStringResAttribute titleQuantityStringResAttribute() {
    return title_QuantityStringResAttribute;
  }

  @Override
  public TestStringOverloadsViewModel_ id(long id) {
    super.id(id);
    return this;
  }

  @Override
  public TestStringOverloadsViewModel_ id(Number... ids) {
    super.id(ids);
    return this;
  }

  @Override
  public TestStringOverloadsViewModel_ id(long id1, long id2) {
    super.id(id1, id2);
    return this;
  }

  @Override
  public TestStringOverloadsViewModel_ id(CharSequence key) {
    super.id(key);
    return this;
  }

  @Override
  public TestStringOverloadsViewModel_ id(CharSequence key, long id) {
    super.id(key, id);
    return this;
  }

  @Override
  public TestStringOverloadsViewModel_ layout(@LayoutRes int arg0) {
    super.layout(arg0);
    return this;
  }

  @Override
  public TestStringOverloadsViewModel_ spanSizeCallback(@Nullable EpoxyModel.SpanSizeCallback arg0) {
    super.spanSizeCallback(arg0);
    return this;
  }

  @Override
  public TestStringOverloadsViewModel_ show() {
    super.show();
    return this;
  }

  @Override
  public TestStringOverloadsViewModel_ show(boolean show) {
    super.show(show);
    return this;
  }

  @Override
  public TestStringOverloadsViewModel_ hide() {
    super.hide();
    return this;
  }

  @Override
  @LayoutRes
  protected int getDefaultLayout() {
    return 1;
  }

  @Override
  public TestStringOverloadsViewModel_ reset() {
    onModelBoundListener_epoxyGeneratedModel = null;
    onModelUnboundListener_epoxyGeneratedModel = null;
    assignedAttributes_epoxyGeneratedModel.clear();
    this.title_CharSequence = null;
    this.title_Int = 0;
    this.title_StringResAttribute = null;
    this.title_QuantityStringResAttribute = null;
    super.reset();
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof TestStringOverloadsViewModel_)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    TestStringOverloadsViewModel_ that = (TestStringOverloadsViewModel_) o;
    if ((onModelBoundListener_epoxyGeneratedModel == null) != (that.onModelBoundListener_epoxyGeneratedModel == null)) {
      return false;
    }
    if ((onModelUnboundListener_epoxyGeneratedModel == null) != (that.onModelUnboundListener_epoxyGeneratedModel == null)) {
      return false;
    }
    if (title_CharSequence != null ? !title_CharSequence.equals(that.title_CharSequence) : that.title_CharSequence != null) {
      return false;
    }
    if (title_Int != that.title_Int) {
      return false;
    }
    if (title_StringResAttribute != null ? !title_StringResAttribute.equals(that.title_StringResAttribute) : that.title_StringResAttribute != null) {
      return false;
    }
    if (title_QuantityStringResAttribute != null ? !title_QuantityStringResAttribute.equals(that.title_QuantityStringResAttribute) : that.title_QuantityStringResAttribute != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (onModelBoundListener_epoxyGeneratedModel != null ? 1 : 0);
    result = 31 * result + (onModelUnboundListener_epoxyGeneratedModel != null ? 1 : 0);
    result = 31 * result + (title_CharSequence != null ? title_CharSequence.hashCode() : 0);
    result = 31 * result + title_Int;
    result = 31 * result + (title_StringResAttribute != null ? title_StringResAttribute.hashCode() : 0);
    result = 31 * result + (title_QuantityStringResAttribute != null ? title_QuantityStringResAttribute.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "TestStringOverloadsViewModel_{" +
        "title_CharSequence=" + title_CharSequence +
        ", title_Int=" + title_Int +
        ", title_StringResAttribute=" + title_StringResAttribute +
        ", title_QuantityStringResAttribute=" + title_QuantityStringResAttribute +
        "}" + super.toString();
  }

  @Override
  public int getSpanSize(int totalSpanCount, int position, int itemCount) {
    return totalSpanCount;
  }
}