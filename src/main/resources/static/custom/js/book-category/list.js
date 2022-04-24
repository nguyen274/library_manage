var bookCategoryId, bookCategoryName;

function removeBookCategoryDialog(el) {
    bookCategoryId = $(el).attr('data-category-id');
    bookCategoryName = $(el).attr('data-category-name');
    $('.remove-category-modal').find('#category-name').text(bookCategoryName);
}

function removeBookCategory() {
    $('.remove-category-modal').modal('hide');
    window.location = "/book-category/remove/" + bookCategoryId;
}