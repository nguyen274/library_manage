var bookStoreId, bookStoreName;

function removeBookStoreDialog(el) {
    bookStoreId = $(el).attr('data-store-id');
    bookStoreName = $(el).attr('data-store-name');
    $('.remove-book-store-modal').find('#book-store-name').text(bookStoreName);
}

function removeBookStore() {
    $('.remove-book-store-modal').modal('hide');
    window.location = "/book-store/remove/" + bookStoreId;
}