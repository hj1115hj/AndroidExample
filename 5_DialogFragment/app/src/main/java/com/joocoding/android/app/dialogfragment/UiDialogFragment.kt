package com.joocoding.android.app.dialogfragment

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment

class UiDialogFragment : DialogFragment() {

    class PurchaseConfirmationDialogFragment : DialogFragment() {
        override fun onCreateDialog(savedInstanceState: Bundle?): Dialog =
            AlertDialog.Builder(requireContext())
                .setMessage("testDialogFragment")
                .setPositiveButton("OK") { _,_ -> }
                .create()

        companion object {
            const val TAG = "PurchaseConfirmationDialog"
        }
    }
}