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

public final class FragmentRegisterBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialButton btnSubscribe;

  @NonNull
  public final TextInputEditText etPassword;

  @NonNull
  public final TextInputEditText etPhoneNumber;

  @NonNull
  public final TextInputEditText etUsername;

  @NonNull
  public final AppCompatImageView imageView02;

  @NonNull
  public final AppCompatTextView imageView03;

  @NonNull
  public final AppCompatTextView imageView04;

  @NonNull
  public final AppCompatTextView imageView05;

  @NonNull
  public final AppCompatTextView imageView06;

  @NonNull
  public final AppCompatImageView ivClose;

  @NonNull
  public final TextInputLayout tlPassword;

  @NonNull
  public final TextInputLayout tlPhoneNumber;

  @NonNull
  public final TextInputLayout tlUsername;

  @NonNull
  public final AppCompatTextView tvAlreadyHaveAnAccount;

  @NonNull
  public final AppCompatTextView tvSignin;

  @NonNull
  public final AppCompatTextView tvWelcome;

  private FragmentRegisterBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialButton btnSubscribe, @NonNull TextInputEditText etPassword,
      @NonNull TextInputEditText etPhoneNumber, @NonNull TextInputEditText etUsername,
      @NonNull AppCompatImageView imageView02, @NonNull AppCompatTextView imageView03,
      @NonNull AppCompatTextView imageView04, @NonNull AppCompatTextView imageView05,
      @NonNull AppCompatTextView imageView06, @NonNull AppCompatImageView ivClose,
      @NonNull TextInputLayout tlPassword, @NonNull TextInputLayout tlPhoneNumber,
      @NonNull TextInputLayout tlUsername, @NonNull AppCompatTextView tvAlreadyHaveAnAccount,
      @NonNull AppCompatTextView tvSignin, @NonNull AppCompatTextView tvWelcome) {
    this.rootView = rootView;
    this.btnSubscribe = btnSubscribe;
    this.etPassword = etPassword;
    this.etPhoneNumber = etPhoneNumber;
    this.etUsername = etUsername;
    this.imageView02 = imageView02;
    this.imageView03 = imageView03;
    this.imageView04 = imageView04;
    this.imageView05 = imageView05;
    this.imageView06 = imageView06;
    this.ivClose = ivClose;
    this.tlPassword = tlPassword;
    this.tlPhoneNumber = tlPhoneNumber;
    this.tlUsername = tlUsername;
    this.tvAlreadyHaveAnAccount = tvAlreadyHaveAnAccount;
    this.tvSignin = tvSignin;
    this.tvWelcome = tvWelcome;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentRegisterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_register, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentRegisterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_subscribe;
      MaterialButton btnSubscribe = rootView.findViewById(id);
      if (btnSubscribe == null) {
        break missingId;
      }

      id = R.id.et_password;
      TextInputEditText etPassword = rootView.findViewById(id);
      if (etPassword == null) {
        break missingId;
      }

      id = R.id.et_phoneNumber;
      TextInputEditText etPhoneNumber = rootView.findViewById(id);
      if (etPhoneNumber == null) {
        break missingId;
      }

      id = R.id.et_username;
      TextInputEditText etUsername = rootView.findViewById(id);
      if (etUsername == null) {
        break missingId;
      }

      id = R.id.imageView_02;
      AppCompatImageView imageView02 = rootView.findViewById(id);
      if (imageView02 == null) {
        break missingId;
      }

      id = R.id.imageView_03;
      AppCompatTextView imageView03 = rootView.findViewById(id);
      if (imageView03 == null) {
        break missingId;
      }

      id = R.id.imageView_04;
      AppCompatTextView imageView04 = rootView.findViewById(id);
      if (imageView04 == null) {
        break missingId;
      }

      id = R.id.imageView_05;
      AppCompatTextView imageView05 = rootView.findViewById(id);
      if (imageView05 == null) {
        break missingId;
      }

      id = R.id.imageView_06;
      AppCompatTextView imageView06 = rootView.findViewById(id);
      if (imageView06 == null) {
        break missingId;
      }

      id = R.id.iv_close;
      AppCompatImageView ivClose = rootView.findViewById(id);
      if (ivClose == null) {
        break missingId;
      }

      id = R.id.tl_password;
      TextInputLayout tlPassword = rootView.findViewById(id);
      if (tlPassword == null) {
        break missingId;
      }

      id = R.id.tl_phoneNumber;
      TextInputLayout tlPhoneNumber = rootView.findViewById(id);
      if (tlPhoneNumber == null) {
        break missingId;
      }

      id = R.id.tl_username;
      TextInputLayout tlUsername = rootView.findViewById(id);
      if (tlUsername == null) {
        break missingId;
      }

      id = R.id.tv_already_have_an_account;
      AppCompatTextView tvAlreadyHaveAnAccount = rootView.findViewById(id);
      if (tvAlreadyHaveAnAccount == null) {
        break missingId;
      }

      id = R.id.tv_signin;
      AppCompatTextView tvSignin = rootView.findViewById(id);
      if (tvSignin == null) {
        break missingId;
      }

      id = R.id.tv_welcome;
      AppCompatTextView tvWelcome = rootView.findViewById(id);
      if (tvWelcome == null) {
        break missingId;
      }

      return new FragmentRegisterBinding((ConstraintLayout) rootView, btnSubscribe, etPassword,
          etPhoneNumber, etUsername, imageView02, imageView03, imageView04, imageView05,
          imageView06, ivClose, tlPassword, tlPhoneNumber, tlUsername, tvAlreadyHaveAnAccount,
          tvSignin, tvWelcome);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
