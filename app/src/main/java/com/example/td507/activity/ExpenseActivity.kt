package com.example.td507.activity

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.example.td507.R
import com.example.td507.dialog.ExpenseDialogFragment
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ExpenseActivity : AppCompatActivity() {
    private lateinit var addPhotoButton: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_expense)

        findViewById<FloatingActionButton>(R.id.expense_add).setOnClickListener {
            ExpenseDialogFragment(1).show(supportFragmentManager, null)
        }

        /*
        addPhotoButton = findViewById(R.id.add_photo)
        //addPhotoButton.setOnClickListener { takePhoto() }

        val takePhoto =
            registerForActivityResult(ActivityResultContracts.TakePicturePreview()) { bitmap ->
                if (bitmap != null) {
                    addPhotoButton.setImageBitmap(bitmap)
                } else {
                    addPhotoButton.setImageResource(R.drawable.ic_baseline_add_a_photo_24)
                }
            }

        addPhotoButton.setOnClickListener {
            takePhoto.launch(null)
        }

        val myInfo = findViewById<LinearLayout>(R.id.my_infos)
        myInfo.setOnClickListener {
            if (checkPermission(android.Manifest.permission.CALL_PHONE)) {
                callSomeone("0782665206")
            }
        }

         */
    }

    /*
    private fun takePhoto() {
        val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        resultLauncher.launch(intent)
    }

    private var resultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
        if(result.resultCode == RESULT_OK){
            val photo = result.data?.extras?.get("data") as Bitmap
            addPhotoButton.setImageBitmap(photo)
        }
    }

    private fun checkPermission(permission: String): Boolean {
        var res = true
        if (ContextCompat.checkSelfPermission(this, permission) != PackageManager.PERMISSION_GRANTED
        ) {
            if (!ActivityCompat.shouldShowRequestPermissionRationale(this, permission)) {
                ActivityCompat.requestPermissions(this, arrayOf(permission), 69)
            }
            res = false
        }
        return res
    }

    private fun callSomeone(number: String) {
        val call: Uri = Uri.parse("tel:$number")
        val surf = Intent(Intent.ACTION_CALL, call)
        startActivity(surf)
    }
     */
}