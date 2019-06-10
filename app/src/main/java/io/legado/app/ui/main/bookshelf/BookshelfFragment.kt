package io.legado.app.ui.main.bookshelf

import android.os.Bundle
import android.view.Menu
import android.view.View
import androidx.core.view.forEach
import io.legado.app.R
import io.legado.app.base.BaseFragment
import kotlinx.android.synthetic.main.view_titlebar.*

class BookshelfFragment : BaseFragment(R.layout.fragment_bookshelf) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setSupportToolbar(toolbar)
    }

    override fun onCompatCreateOptionsMenu(menu: Menu) {
        menuInflater.inflate(R.menu.bookshelf, menu)
    }


}