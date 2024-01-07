// Generated by view binder compiler. Do not edit!
package com.caravan.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.caravan.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentChangePasswordBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialButton btnSave;

  @NonNull
  public final TextInputEditText etConfirmPassword;

  @NonNull
  public final TextInputEditText etNewPassword;

  @NonNull
  public final TextInputEditText etOldPassword;

  @NonNull
  public final AppCompatImageView ivBack;

  @NonNull
  public final AppCompatTextView textView02;

  @NonNull
  public final TextInputLayout tlConfirmPassword;

  @NonNull
  public final TextInputLayout tlNewPassword;

  @NonNull
  public final TextInputLayout tlOldPassword;

  @NonNull
  public final AppCompatTextView tvConfirmPassword;

  @NonNull
  public final AppCompatTextView tvNewPassword;

  @NonNull
  public final AppCompatTextView tvOldPassword;

  private FragmentChangePasswordBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialButton btnSave, @NonNull TextInputEditText etConfirmPassword,
      @NonNull TextInputEditText etNewPassword, @NonNull TextInputEditText etOldPassword,
      @NonNull AppCompatImageView ivBack, @NonNull AppCompatTextView textView02,
      @NonNull TextInputLayout tlConfirmPassword, @NonNull TextInputLayout tlNewPassword,
      @NonNull TextInputLayout tlOldPassword, @NonNull AppCompatTextView tvConfirmPassword,
      @NonNull AppCompatTextView tvNewPassword, @NonNull AppCompatTextView tvOldPassword) {
    this.rootView = rootView;
    this.btnSave = btnSave;
    this.etConfirmPassword = etConfirmPassword;
    this.etNewPassword = etNewPassword;
    this.etOldPassword = etOldPassword;
    this.ivBack = ivBack;
    this.textView02 = textView02;
    this.tlConfirmPassword = tlConfirmPassword;
    this.tlNewPassword = tlNewPassword;
    this.tlOldPassword = tlOldPassword;
    this.tvConfirmPassword = tvConfirmPassword;
    this.tvNewPassword = tvNewPassword;
    this.tvOldPassword = tvOldPassword;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentChangePasswordBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentChangePasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_change_password, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentChangePasswordBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_save;
      MaterialButton btnSave = rootView.findViewById(id);
      if (btnSave == null) {
        break missingId;
      }

      id = R.id.et_confirm_password;
      TextInputEditText etConfirmPassword = rootView.findViewById(id);
      if (etConfirmPassword == null) {
        break missingId;
      }

      id = R.id.et_new_password;
      TextInputEditText etNewPassword = rootView.findViewById(id);
      if (etNewPassword == null) {
        break missingId;
      }

      id = R.id.et_old_password;
      TextInputEditText etOldPassword = rootView.findViewById(id);
      if (etOldPassword == null) {
        break missingId;
      }

      id = R.id.iv_back;
      AppCompatImageView ivBack = rootView.findViewById(id);
      if (ivBack == null) {
        break missingId;
      }

      id = R.id.textView_02;
      AppCompatTextView textView02 = rootView.findViewById(id);
      if (textView02 == null) {
        break missingId;
      }

      id = R.id.tl_confirm_password;
      TextInputLayout tlConfirmPassword = rootView.findViewById(id);
      if (tlConfirmPassword == null) {
        break missingId;
      }

      id = R.id.tl_new_password;
      TextInputLayout tlNewPassword = rootView.findViewById(id);
      if (tlNewPassword == null) {
        break missingId;
      }

      id = R.id.tl_old_password;
      TextInputLayout tlOldPassword = rootView.findViewById(id);
      if (tlOldPassword == null) {
        break missingId;
      }

      id = R.id.tv_confirm_password;
      AppCompatTextView tvConfirmPassword = rootView.findViewById(id);
      if (tvConfirmPassword == null) {
        break missingId;
      }

      id = R.id.tv_new_password;
      AppCompatTextView tvNewPassword = rootView.findViewById(id);
      if (tvNewPassword == null) {
        break missingId;
      }

      id = R.id.tv_old_password;
      AppCompatTextView tvOldPassword = rootView.findViewById(id);
      if (tvOldPassword == null) {
        break missingId;
      }

      return new FragmentChangePasswordBinding((ConstraintLayout) rootView, btnSave,
          etConfirmPassword, etNewPassword, etOldPassword, ivBack, textView02, tlConfirmPassword,
          tlNewPassword, tlOldPassword, tvConfirmPassword, tvNewPassword, tvOldPassword);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}